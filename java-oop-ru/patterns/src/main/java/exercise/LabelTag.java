package exercise;

public class LabelTag implements TagInterface {
    private String label;
    private TagInterface tag;

    public LabelTag(String label, TagInterface tag) {
        this.label = label;
        this.tag = tag;
    }

    @Override
    public String render() {
        String tmp = tag.render();
        return String.format("<label>%s%s</label>", label, tmp);
    }
}
