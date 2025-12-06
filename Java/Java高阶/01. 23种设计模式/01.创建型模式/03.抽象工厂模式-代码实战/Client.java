public class Client {
    public static void main(String[] args) {
        // 假设当前运行环境为 Web
        UIFactory factory = new WebUIFactory();

        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();
        Image image = factory.createImage();

        button.render();
        textBox.render();
        image.render();
    }
}