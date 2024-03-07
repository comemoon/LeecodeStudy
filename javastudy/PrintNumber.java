package javastudy;

public class PrintNumber implements Runnable{
    private static int number=1;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                notify();//一旦执行，唤醒被wait()的线程中优先级最高的线程，如果被wait的多个优先级相同，则随机唤醒一个
                        //从当初被wait的位置继续执行
                if(number<=100){
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        wait();//进入阻塞状态，释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread thread1 = new Thread(printNumber,"线程1");
        Thread thread2 = new Thread(printNumber,"线程2");
        thread1.start();
        thread2.start();
    }
}
