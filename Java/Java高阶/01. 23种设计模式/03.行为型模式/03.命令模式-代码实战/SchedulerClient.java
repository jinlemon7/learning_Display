public class SchedulerClient {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new EmailTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new ReportTask());

        scheduler.run();
    }
}