//b. By extending Thread class.

package Lab2;

class ThreadA implements Runnable {
    public void run() {
        for (int i = 101; i <= 200; i += 2)
            System.out.println("Thread1 Prints odd = " + i);
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 100; i <= 200; i += 2)
            System.out.println("Thread2 Prints even = " + i);
    }
}

public class Q08b {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());

        t1.start();
        t2.start();
    }
}
