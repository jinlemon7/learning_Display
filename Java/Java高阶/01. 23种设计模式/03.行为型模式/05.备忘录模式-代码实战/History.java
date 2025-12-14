import java.util.Stack;

public class History {
    private Stack<DocumentMemento> history = new Stack<>();
    private Stack<DocumentMemento> redoStack = new Stack<>();

    public void pushMemento(DocumentMemento memento) {
        history.push(memento);
        redoStack.clear(); // 每次新操作时清空重做栈
    }

    public DocumentMemento popMemento() {
        if (!history.isEmpty()) {
            DocumentMemento memento = history.pop();
            redoStack.push(memento);
            return memento;
        }
        return null;
    }

    public DocumentMemento popRedoMemento() {
        if (!redoStack.isEmpty()) {
            DocumentMemento memento = redoStack.pop();
            history.push(memento);
            return memento;
        }
        return null;
    }
}