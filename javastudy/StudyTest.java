package javastudy;

import java.util.ArrayList;
import java.util.List;

public class StudyTest extends Study1 {
    
    @Override
    public List printMy(){
        List<Integer> result = new ArrayList<>();
        result.add(90);
        System.out.println(super.printMy());
        return result;
    }

    public ArrayList printMy2(){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(90);
        return result;
    }
    public static void main(String[] args) {
        Study1 study1 = new Study1();
        Study1 qw = study1;
        System.out.println(study1.hashCode());
        System.out.println(qw.hashCode());

        StudyTest st = new StudyTest();
        System.out.println(st.printMy());
        System.out.println(st.printMy2());
        System.out.println(study1.wingno);
    }
}
