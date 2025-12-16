public interface DocumentVisitor {
    void visit(PDFDocument pdf);
    void visit(WordDocument word);
    void visit(ExcelDocument excel);
}