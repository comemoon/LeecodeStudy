package javastudy;

import org.junit.Test;

import java.util.Scanner;

public class Exp1 {
    int ts = 1;
    @Test
    public void test1(){
        System.out.println("测试一下");
    }
    @Test
    public void test2(){
        System.out.println(ts);
    }
    @Test
    public void test3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = scanner.nextInt();
        System.out.println(num);
    }
    @Test
    public void test4(){
        System.out.println("zhegshidfsdf");
    }
    @Test
    public void test5(){
        
    }
}
