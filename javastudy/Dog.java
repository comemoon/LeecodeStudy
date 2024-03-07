package javastudy;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.teeth();
        int ae = 10;
        System.out.println(ae);
    }
}
