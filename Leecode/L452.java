import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
//        Arrays.sort(points);
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i][0]);
            System.out.print(points[i][1]);
            System.out.println();
        }
        return 1;
    }
    @Test
    public void test(){
        int[][] inputs = new int[][]{{1,0},{1,2},{3,4},{5,9}};
        int result = findMinArrowShots(inputs);
        String s = "dfasd";
//        List<Integer> result = new ArrayList<>();
        
    }

}
