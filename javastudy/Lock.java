package javastudy;

import java.util.ArrayList;

public class Lock {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
       Thread thread1 = new Thread(){
            @Override
            public void run() {
                synchronized (arrayList){
                    arrayList.add(1);
                    arrayList2.add(12);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (arrayList2){
                        arrayList.add(2);
                        arrayList2.add(22);
                    }

                }
            }
        };
       Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (arrayList2){
                    arrayList.add(2);
                    arrayList2.add(22);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (arrayList){
                        arrayList.add(1);
                        arrayList2.add(12);
                    }

                }
            }
       };
       thread1.start();
       thread2.start();
    }
}
