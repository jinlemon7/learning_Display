import java.util.ArrayList;
import java.util.List;

public class WordDocument implements DocumentPrototype {
    private String title;
    private String content;
    private List<String> images;

    public WordDocument(String title, String content, List<String> images) {
        this.title = title;
        this.content = content;
        this.images = new ArrayList<>(images);
    }

    @Override
    public DocumentPrototype cloneDocument() {
        try {
            WordDocument copy = (WordDocument) super.clone();
            copy.images = new ArrayList<>(this.images); // 深拷贝，避免共享引用
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed", e);
        }
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Images: " + images);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addImage(String image) {
        this.images.add(image);
    }
}