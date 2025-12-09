public class FileLeaf implements FileComponent {
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    public void display(String indent) {
        System.out.println(indent + "- 文件：" + name);
    }
}