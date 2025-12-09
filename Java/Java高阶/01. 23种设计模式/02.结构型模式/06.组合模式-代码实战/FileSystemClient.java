public class FileSystemClient {
    public static void main(String[] args) {
        // 创建文件
        FileLeaf file1 = new FileLeaf("readme.txt");
        FileLeaf file2 = new FileLeaf("logo.png");
        FileLeaf file3 = new FileLeaf("data.csv");

        // 创建文件夹
        FolderComposite root = new FolderComposite("根目录");
        FolderComposite docs = new FolderComposite("文档");
        FolderComposite images = new FolderComposite("图片");

        // 构建层级关系
        docs.add(file1);
        images.add(file2);

        root.add(docs);
        root.add(images);
        root.add(file3);

        // 显示结构
        root.display("");
    }
}