import org.junit.Test;

import java.util.ArrayList;

public class L134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        ArrayList<Integer> starts = new ArrayList<>();
        for(int i=0;i<gas.length;i++){
            if(gas[i]>=cost[i]){
                starts.add(i);
            }
        }
        for(int j=0;j<starts.size();j++){
            int start = starts.get(j);
            int now_gas = gas[start%len];
            int now_len = 0;
            while(now_len<gas.length){
                now_gas = now_gas+gas[(start+1)%len]-cost[start%len];
                if(now_gas<cost[(start+1)%len]){
                    break;
                }
                start++;
                now_len++;
            }
            if(now_len==gas.length){
                return starts.get(j);
            }
        }
        return -1;
    }
    @Test
    public void test(){
        int[] gas = new int[]{0,0,0,0,2};
        int[] cost = new int[]{0,0,0,1,0};
        int result = canCompleteCircuit(gas,cost);
        System.out.println(result);
    }
}
