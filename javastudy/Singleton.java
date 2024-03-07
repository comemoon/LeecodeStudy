package javastudy;

public class Singleton {
//    1.私有化构造器
    private Singleton(){

    }
    private static Singleton sigle = new Singleton();
    public static Singleton getSigle() {
        return sigle;
    }
}
