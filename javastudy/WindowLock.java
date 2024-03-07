package javastudy;

import java.util.concurrent.locks.ReentrantLock;

public class WindowLock implements Runnable{
    private static int tickets=100;
    private boolean isFlag = true;
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (isFlag){
            try {
                lock.lock();
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+":"+tickets);
                    tickets--;
                }else{
                    isFlag = false;
                }
            }finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) {
        WindowLock windowLock = new WindowLock();
        Thread thread1 = new Thread(windowLock,"daima1");
        Thread thread2 = new Thread(windowLock,"daima2");
        thread1.start();
        thread2.start();
    }
}
