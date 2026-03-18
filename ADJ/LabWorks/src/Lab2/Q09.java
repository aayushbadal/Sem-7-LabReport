// 9. Write a java program to set and get thread priorities in multithreaded application.

package Lab2;

class multiThread extends Thread {
    public void run() {
        System.out.println(
                "Name =" + Thread.currentThread().getName() + "and Priority =" + Thread.currentThread().getPriority());
    }
}

public class Q09 {
    public static void main(String[] args) {
        multiThread t1 = new multiThread();
        multiThread t2 = new multiThread();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
