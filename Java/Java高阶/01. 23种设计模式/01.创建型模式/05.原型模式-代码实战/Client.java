import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> images = new ArrayList<>();
        images.add("cover.png");

        WordDocument template = new WordDocument("招聘简历模板", "请填写个人信息", images);
        System.out.println("== 原始模板 ==");
        template.show();

        WordDocument doc1 = (WordDocument) template.cloneDocument();
        doc1.setTitle("鱼皮的简历");
        doc1.setContent("鱼皮，5年的全栈开发经验");
        doc1.addImage("yupi_avatar.png");

        WordDocument doc2 = (WordDocument) template.cloneDocument();
        doc2.setTitle("yes的简历");
        doc2.setContent("yes，8年的Java开发经验");
        doc2.addImage("yes_avatar.png");

        System.out.println("\n== 克隆出的鱼皮的简历 ==");
        doc1.show();

        System.out.println("\n== 克隆出的yes的简历 ==");
        doc2.show();
    }
}