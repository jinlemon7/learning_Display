public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public DocumentMemento save() {
        return new DocumentMemento(this.content);
    }

    public void restore(DocumentMemento memento) {
        this.content = memento.getContent();
    }
}