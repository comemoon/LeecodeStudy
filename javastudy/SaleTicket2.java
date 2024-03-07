package javastudy;

public class SaleTicket2 implements Runnable{
    private static int tickets = 100;
    private  boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sale();
        }
    }
    private  synchronized  void sale(){

        if(tickets>0){
            System.out.println(Thread.currentThread().getName()+":票号："+tickets);
            tickets--;
        }else{
            isFlag = false;
        }
    }

    public static void main(String[] args) {
        SaleTicket2 saleTicket2 = new SaleTicket2();
        Thread thread1 = new Thread(saleTicket2, "窗口1");
        Thread thread2 = new Thread(saleTicket2,"窗口2");
        Thread thread3 = new Thread(saleTicket2,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
