public class Client {
    public static void main(String[] args) {
        Document pdf = new PDFDocument("这是 PDF 文件的内容");
        Document word = new WordDocument("这是 Word 文档的内容");
        Document excel = new ExcelDocument(new String[][] {
            {"姓名", "成绩"},
            {"鱼皮", "90"},
            {"Yes哥", "95"}
        });

        DocumentVisitor htmlExporter = new HtmlExportVisitor();

        pdf.accept(htmlExporter);
        word.accept(htmlExporter);
        excel.accept(htmlExporter);
    }
}