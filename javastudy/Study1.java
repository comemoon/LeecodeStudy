package javastudy;
import java.util.*;


public class Study1 {
    private String wingprivate = "123455";
    String wingno = "dfsadf";
    public String wingpublic = "33333";
    protected String wingprotected = "protected";
    protected void outrt(){
        System.out.println(wingprotected);
    }
    public List printMy(){
        List<Integer> result = Arrays.asList(12,3,4,5);
        
        return result;
    }
    public ArrayList printMy2(){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(12);
        result.add(23);
        return result;
    }
    public static void main(String[] args){
        Study1 study1 = new Study1();
        List<Integer> result = study1.printMy();
        ArrayList<Integer> result2 = study1.printMy2();
        System.out.println(result);
        System.out.println(result2);
        // System.out.println(study1.wingprivate);
        // System.out.println(study1.wingno);
        // System.out.println(study1.wingpublic);
        // System.out.println(study1.wingprotected);
        // int[] arr1 = new int[]{1,2,3,4,5};
        // // int[] arr2 = new int[]{1,2,3,4,5};
        // int[] arr2 =arr1;
        // System.out.println(arr1==arr2);
        // System.out.println(Arrays.equals(arr1, arr2));
        // int[] arr = new int[3];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // int[] arr2 = arr;
        // arr2[1] = 13;
        // for(int i=0;i<arr2.length;i++){
        //     System.out.println(arr2[i]);
        // }
        // System.out.println(arr+"  "+arr2);
        // int[][] nums = new int[3][4];
        // int[][] nums2 = new int[3][];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[1].length;j++){
        //         System.out.print(nums[i][j]);
        //     }
        //     System.out.println();
        // }
        // int[][] result = new int[5][];
        // for(int i=0;i<5;i++){
        //     result[i] = new int[i+1];
        // }
        // for(int i=0;i<5;i++){
        //     for(int j = 0;j<i+1;j++){
        //         result[i][j]=i+1;
        //     }
        // }
        // for(int i=0;i<5;i++){
        //     for(int j = 0;j<i+1;j++){
        //         System.out.print(result[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}
