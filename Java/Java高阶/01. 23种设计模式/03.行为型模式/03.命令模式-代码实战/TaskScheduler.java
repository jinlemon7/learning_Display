import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> taskQueue = new LinkedList<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void run() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            try {
                task.execute();
                System.out.println("任务执行成功！");
            } catch (Exception e) {
                System.out.println("任务执行失败，记录日志以供重试...");
            }
        }
    }
}