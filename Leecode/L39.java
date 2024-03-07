import java.util.*;

class L39 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        trans(candidates,target,0);
        HashSet<List<Integer>> hash1 = new HashSet<>(result);
        List<List<Integer>> r = new ArrayList<>(hash1);
        return r;
    }
    private void trans(int[] candidates,int target,int num){
        if(num == target){
            Collections.sort(temp);
            result.add(new ArrayList(temp));
            return ;
        }
        if(num>target){
            return;
        }
        for(int i=0;i<candidates.length;i++){
            num+=candidates[i];
            temp.add(candidates[i]);
            trans(candidates,target,num);
            num-=candidates[i];
            temp.remove(temp.size()-1);
        }

    }

    
    public static void main(String[] args) {
        int[] input = new int[]{2,3,5};
        int target = 8;
        new L39().combinationSum(input, target);
    }
}