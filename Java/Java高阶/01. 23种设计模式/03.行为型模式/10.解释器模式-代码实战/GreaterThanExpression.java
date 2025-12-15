class GreaterThanExpression implements Expression {
    private String field;
    private int value;

    public GreaterThanExpression(String field, int value) {
        this.field = field;
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        if ("age".equals(field)) {
            return context.getAge() > value;
        } else if ("score".equals(field)) {
            return context.getScore() > value;
        }
        return false;
    }
}