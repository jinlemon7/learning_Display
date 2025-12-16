public class HtmlExportVisitor implements DocumentVisitor {

    @Override
    public void visit(PDFDocument pdf) {
        System.out.println("<html><body><h1>PDF 内容</h1><p>" + pdf.getContent() + "</p></body></html>");
    }

    @Override
    public void visit(WordDocument word) {
        System.out.println("<html><body><h1>Word 内容</h1><p>" + word.getContent() + "</p></body></html>");
    }

    @Override
    public void visit(ExcelDocument excel) {
        System.out.println("<html><body><h1>Excel 内容</h1><table border='1'>");
        for (String[] row : excel.getTable()) {
            System.out.print("<tr>");
            for (String cell : row) {
                System.out.print("<td>" + cell + "</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table></body></html>");
    }
}