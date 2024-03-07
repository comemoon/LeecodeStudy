package javastudy;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        Runnable runnable1 = new MyRunnable();
        new Thread(runnable1,"线程1").start();
        new Thread(runnable1,"线程2").start();

    }
}
