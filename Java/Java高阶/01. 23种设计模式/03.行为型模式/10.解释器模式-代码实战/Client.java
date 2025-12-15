public class Client {
    public static void main(String[] args) {
        // 用户输入的动态规则
        String rule = "age > 18 && score < 500";

        // 创建上下文对象
        Context context = new Context(20, 450);  // 假设 age = 20, score = 450

        // 解析规则表达式
        Expression expression = RuleParser.parse(rule);

        // 判断规则是否成立
        boolean result = expression.interpret(context);
        System.out.println("表达式结果: " + result);  // 输出结果
    }
}