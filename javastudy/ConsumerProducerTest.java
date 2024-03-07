package javastudy;

public class ConsumerProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk,"生产者");
        Consumer c1 = new Consumer(clerk,"消费者1");
        Consumer c2 = new Consumer(clerk,"消费者2");
        p1.start();
        c2.start();
        c1.start();
    }
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk,String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品");
        while (true){
            clerk.minusProduct();
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk,String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true){
            clerk.addProduct();
        }
    }
}
class Clerk{
    private int productNum = 0;//产品数量
    private static final int MAX_PRODUCT = 20;
    private static final int MIN_PRODUCT = 1;

    //增加产品
    public synchronized void addProduct(){
        if(productNum<MAX_PRODUCT){
            productNum++;
            System.out.println(Thread.currentThread().getName()+"生产了"+productNum+"个产品");
            this.notifyAll();
        }else{
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //减少产品
    public synchronized void minusProduct(){
        if(productNum>MIN_PRODUCT){
            productNum--;
            System.out.println(Thread.currentThread().getName()+"减少了"+productNum+"个产品");
            this.notifyAll();
        }else{
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
