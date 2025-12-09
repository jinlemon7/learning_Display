import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private Map<String, Glyph> glyphPool = new HashMap<>();

    public Glyph getGlyph(char symbol, String font) {
        String key = symbol + ":" + font;
        if (!glyphPool.containsKey(key)) {
            glyphPool.put(key, new CharacterGlyph(symbol, font));
        }
        return glyphPool.get(key);
    }
}