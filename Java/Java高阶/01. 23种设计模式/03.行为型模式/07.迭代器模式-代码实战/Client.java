public class Client {
    public static void main(String[] args) {
        Workflow workflow = new Workflow(5);
        workflow.addNode(new ProcessNode("开始"));
        workflow.addNode(new ProcessNode("审批"));
        workflow.addNode(new ProcessNode("通知"));
        workflow.addNode(new ProcessNode("结束"));

        // 获取迭代器进行遍历
        Iterator iterator = workflow.iterator();
        while (iterator.hasNext()) {
            ProcessNode node = (ProcessNode) iterator.next();
            System.out.println("Executing node: " + node);
        }
    }
}