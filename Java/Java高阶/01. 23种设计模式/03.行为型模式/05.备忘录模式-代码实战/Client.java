public class Client {
    public static void main(String[] args) {
        Document document = new Document("初始内容");
        History history = new History();

        // 保存初始状态
        history.pushMemento(document.save());
        System.out.println("文档内容: " + document.getContent());

        // 修改文档内容
        document.setContent("第一次编辑");
        history.pushMemento(document.save());
        System.out.println("文档内容: " + document.getContent());

        // 修改文档内容
        document.setContent("第二次编辑");
        history.pushMemento(document.save());
        System.out.println("文档内容: " + document.getContent());

        // 撤销
        document.restore(history.popMemento());
        System.out.println("撤销后文档内容: " + document.getContent());

        // 再次撤销
        document.restore(history.popMemento());
        System.out.println("再次撤销后文档内容: " + document.getContent());

        // 重做
        document.restore(history.popRedoMemento());
        System.out.println("重做后文档内容: " + document.getContent());
    }
}