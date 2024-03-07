import java.lang.reflect.Array;
import java.util.*;;

public class L40 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Arrays.sort(candidates);
        trans(candidates,target,0,0);
        List<List<Integer>> rtemp = new ArrayList<>();
        for(int i=0;i<result.size();i++){
            Collections.sort(result.get(i));
            rtemp.add(result.get(i));
        }
        HashSet<List<Integer>> hash1 = new HashSet<>(rtemp);
        List<List<Integer>> r = new ArrayList<>(hash1);
        return r;
    }
    private void trans(int[] candidates,int target,int num,int index){
        if(num == target){
            result.add(new ArrayList(temp));
            return ;
        }
        if(num>target){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if ( i > index && candidates[i] == candidates[i - 1] ) {
                continue;
            } 
            num+=candidates[i];
            temp.add(candidates[i]);
            trans(candidates,target,num,i+1);
            num-=candidates[i];
            temp.remove(temp.size()-1);
        }

    }
    public static void main(String[] args) {
        int[] input = new int[]{10,1,1,2,7,6,5};
        new L40().combinationSum2(input, 8);
    }
}