package javastudy;

import javax.xml.namespace.QName;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"：："+i);
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");
        thread1.start();
        thread2.start();

    }
}
