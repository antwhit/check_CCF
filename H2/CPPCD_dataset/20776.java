class TestNotification {

    public static void main(String args[]) {
        System.out.println("TestNotification");
        int cnt = 20;
        Mailbox mailbox = new Mailbox(cnt);
        Flag flag = new Flag();
        Task tasks[] = new Task[cnt];
        for (int i = 0; i < cnt; ++i) tasks[i] = new Task(mailbox, flag, i);
        TestNotification test = new TestNotification(tasks);
        test.run();
        mailbox.await();
        for (int i = 0; i < cnt; ++i) System.out.println("main: " + mailbox.messages[i] + " replied");
        System.out.println("main: sleeping");
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("main: running");
        flag.set();
        for (int i = 0; i < cnt; ++i) {
            System.out.println("main: joining " + tasks[i].getTaskName());
            try {
                tasks[i].join();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("main: bye");
    }

    Task tasks[];

    TestNotification(Task tasks[]) {
        this.tasks = tasks;
    }

    public void run() {
        for (int i = 0; i < tasks.length; ++i) tasks[i].start();
    }
}
