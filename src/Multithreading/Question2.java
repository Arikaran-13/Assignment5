package Multithreading;

public class Question2 {
    public static void main(String[] args) {
    InfiniteThread t3 = new InfiniteThread();
        t3.setDaemon(true);
        t3.start();
        Runnable r1 = new Demo();
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("pong");
            }
        };


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }

}
class Demo implements Runnable {

    @Override
    public void run() {
        System.out.println("ping");
    }

}
class InfiniteThread extends Thread{
private boolean flag;
    @Override
    public void run() {
        while(!flag)
        func();
    }
    public void cancelflag(){
        this.flag=true;
    }
    public boolean isflagActive(){
        return flag;
    }
    public void func(){
        System.out.println("Tong");
    }
}


