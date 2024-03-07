package javastudy;

public class USB implements USB2{
    @Override
    public void outUSB1() {
        System.out.println(1111);
    }

    @Override
    public void test() {


        
    }

    @Override
    public void printUSB() {
        System.out.println(2222);
    }

    public static void main(String[] args) {
        USB1 usb2 = new USB();
//        usb2.printUSB();
        usb2.outUSB1();

    }
}
