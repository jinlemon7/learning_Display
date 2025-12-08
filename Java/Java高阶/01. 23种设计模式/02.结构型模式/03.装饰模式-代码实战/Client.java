public class Client {
    public static void main(String[] args) {
        TextComponent text = new PlainText("Hello, Decorator!");

        // 添加加粗
        text = new BoldDecorator(text);

        // 添加红色字体
        text = new ColorDecorator(text, "red");

        System.out.println("最终渲染结果：");
        System.out.println(text.render());
    }
}