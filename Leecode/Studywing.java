import javastudy.Study1;

public class Studywing extends Study1 {
    public void outP(){
        // Study1 study1 = new Study1();
        // System.out.println(study1.wingpublic);
        System.out.println(wingprotected);
        outrt();
    }
    public static void main(String[] args) {
        Studywing study1 = new Studywing();
        System.out.println(study1.wingprotected);
        study1.outP();
        
    }
}
