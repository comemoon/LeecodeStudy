import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class L406 {
    public int[][] reconstructQueue(int[][] people) {
        int[][] result = new int[people.length][2];
        for(int k=0;k<result.length;k++){
            result[k][0] = Integer.MAX_VALUE;
        }
        int start = 0;
        for(int i=0;i<people.length;i++){
            if(people[i][1] == 0 ){
                if(people[i][0]<result[0][0]){
                    result[0][0] = people[i][0];
                    result[0][1] = people[i][1];
                    start = i;
                }
            }
        }
        people[start][0] = Integer.MAX_VALUE;
        int resultlen = 1;
        while(resultlen<people.length){
            for(int i=0;i<people.length;i++){
                if(people[i][0]!=Integer.MAX_VALUE){
                    int tempsum = 0;
                    for(int j=0;j<resultlen;j++){
                        if(result[j][0]>=people[i][0]){
                            tempsum++;
                        }
                    }
                    if(people[i][1] ==tempsum){
                        if(people[i][0]<result[resultlen][0]){
                            result[resultlen][0] = people[i][0];
                            result[resultlen][1] = people[i][1];
                            start = i;
                        }
                    }
                }
            }
            people[start][0] = Integer.MAX_VALUE;
            resultlen++;
        }
        return result;
    }
    public int[][] reconstructQueue2(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        LinkedList<int[]> resultlist = new LinkedList<>();
        for(int i=0;i<people.length;i++){
            resultlist.add(people[i][1],people[i]);
        }
        return  resultlist.toArray(new int[people.length][]);
    }
    @Test
    public void test(){
        int[][] input = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] result = reconstructQueue(input);
        System.out.println(result);
    }
    @Test
    public void test2(){
        int[][] input = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] result = reconstructQueue2(input);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+":"+result[i][1]);
        }

    }
}
