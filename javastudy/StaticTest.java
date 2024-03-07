package javastudy;

public class StaticTest {
    public static void main(String[] args) {
        Demo test = null;
        test.hello();
    }
}
class Demo{
    public static void hello(){
        System.out.println("hello!");
    }
}
