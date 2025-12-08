public class ColorDecorator extends TextDecorator {
    private String color;

    public ColorDecorator(TextComponent component, String color) {
        super(component);
        this.color = color;
    }

    @Override
    public String render() {
        return "<span style='color:" + color + "'>" + component.render() + "</span>";
    }
}