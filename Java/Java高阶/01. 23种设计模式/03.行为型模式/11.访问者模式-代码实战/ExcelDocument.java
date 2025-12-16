public class ExcelDocument implements Document {
    private String[][] table;

    public ExcelDocument(String[][] table) {
        this.table = table;
    }

    public String[][] getTable() {
        return table;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}