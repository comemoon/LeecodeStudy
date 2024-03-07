package javastudy;

public class Chinese {
    //实例变量
    String name;
    int age;
//    类变量
    private static String nations;

    public static void setNations(String nations) {
        Chinese.nations = nations;
    }

    public static String getNations() {
        return nations;
    }

    public Chinese(){

    }
    public Chinese(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        Chinese.setNations("惹上");
        System.out.println(Chinese.getNations());
//        System.out.println(Chinese.nations);
    }
}
