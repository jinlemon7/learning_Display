class RuleParser {
    public static Expression parse(String rule) {
        String[] tokens = rule.split("&&");  // 按“&&”分割表达式
        Expression left = null;
        Expression right = null;

        for (String token : tokens) {
            token = token.trim();
            if (token.contains(">")) {
                String[] parts = token.split(">");
                String field = parts[0].trim();
                int value = Integer.parseInt(parts[1].trim());
                left = new GreaterThanExpression(field, value);
            } else if (token.contains("<")) {
                String[] parts = token.split("<");
                String field = parts[0].trim();
                int value = Integer.parseInt(parts[1].trim());
                right = new LessThanExpression(field, value);
            }
        }
        return new AndExpression(left, right);  // 合并左右表达式
    }
}