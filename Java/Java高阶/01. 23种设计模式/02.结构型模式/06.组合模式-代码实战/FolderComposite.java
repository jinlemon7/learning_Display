import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    public void display(String indent) {
        System.out.println(indent + "+ 文件夹：" + name);
        for (FileComponent child : children) {
            child.display(indent + "  ");
        }
    }
}