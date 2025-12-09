public class CharacterGlyph implements Glyph {
    private final char symbol; // 内部状态，不随使用变化
    private final String font; // 内部状态：字体

    public CharacterGlyph(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void render(int x, int y, String color) {
        System.out.println("渲染字符 '" + symbol + "'，字体：" + font + "，颜色：" + color + "，位置：(" + x + "," + y + ")");
    }
}