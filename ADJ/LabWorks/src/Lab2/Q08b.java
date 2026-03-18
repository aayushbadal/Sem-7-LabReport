//b. By extending Thread class.

package Lab2;

class ThreadA extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i += 2)
            System.out.println("Thread A Prints odd = " + i);
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i += 2)
            System.out.println("Thread B Prints even = " + i);
    }
}

public class Q08b {
    public static void main(String[] args) {

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}
