package javastudy;

public class WindowTest extends Thread{
    private static int tickets = 100;
    private static Object object = new Object();
    boolean isFlag=true;
    public  WindowTest(String name){
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
//            同步代码块 obj必须得是唯一的
            synchronized(object){
                if(tickets>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName()+"卖出一张票，当前票号为："+tickets);
                    tickets--;
                }else{
                    isFlag = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        WindowTest windowTest1 = new WindowTest("窗口1");
        WindowTest windowTest2 = new WindowTest("窗口2");
        WindowTest windowTest3 = new WindowTest("窗口3");
        windowTest1.start();
        windowTest2.start();
        windowTest3.start();

    }
}


