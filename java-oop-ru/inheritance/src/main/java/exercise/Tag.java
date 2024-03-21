package exercise;

import java.util.stream.Collectors;
import java.util.Map;

public class Tag {
    private String tagName;
    private Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<" + tagName + " ");
        attributes.forEach((k, v) -> {
            String attribute = String.format("%s=\"%s\" ", k, v);
            sb.append(attribute);
        });
        sb.replace(sb.length() - 1, sb.length(), "");
        sb.append(">");

        return sb.toString();
    }

    public String getTagName() {
        return tagName;
    }
}
