package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> singleTags;

    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> singleTags) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.singleTags = singleTags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(tagBody);
        singleTags.forEach(tag -> sb.append(tag.toString()));
        sb.append("<" + "/" + super.getTagName() + ">");
        return sb.toString();
    }
}

