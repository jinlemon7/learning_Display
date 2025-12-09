public class CharacterView {
    private final Glyph glyph;
    private final int x;
    private final int y;
    private final String color;

    public CharacterView(Glyph glyph, int x, int y, String color) {
        this.glyph = glyph;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw() {
        glyph.render(x, y, color);
    }
}