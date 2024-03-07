package javastudy;

public class WindowTest2 extends Thread{
    private static int ticket = 100;

    private static boolean isFlag = true;


    public WindowTest2(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (isFlag){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            show();
        }
    }

    private synchronized static void show(){
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+":票根："+ticket);
            ticket--;
        }else{
            isFlag = false;
        }
    }
    public static void main(String[] args) {

        WindowTest2 windowTest1 = new WindowTest2("窗口1");
        WindowTest2 windowTest2 = new WindowTest2("窗口2");
        WindowTest2 windowTest3 = new WindowTest2("窗口3");
        windowTest1.start();
        windowTest2.start();
        windowTest3.start();

    }
}

