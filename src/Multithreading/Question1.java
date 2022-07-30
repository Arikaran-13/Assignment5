package Multithreading;

public class Question1 {
    public static void main(String[] args) {
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("pong");
            }
        };
        Runnable r1 = new Threaddemo1();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}
class Threaddemo1 implements Runnable {

    @Override
    public void run() {
        System.out.println("ping");
    }
}
