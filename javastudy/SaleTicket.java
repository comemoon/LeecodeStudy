package javastudy;

public class SaleTicket implements Runnable{
    private static int ticket = 100;
    private boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag){
            synchronized(this){
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"票号为："+ticket);
                    ticket--;
                }else{
                    isFlag=false;
                }
            }
        }
    }


    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();
        Thread thread1 = new Thread(s,"窗口1");
        Thread thread2 = new Thread(s,"窗口2");
        Thread thread3 = new Thread(s,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
