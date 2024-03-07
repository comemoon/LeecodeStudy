import java.util.*;

public class L216{
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        trans(k,n,1);
        return result;
    }
    private void trans(int k,int n,int startindex){
        if(path.size() == k){
            if(n==0)
                result.add(path);
            return;
        }
        for(int i=startindex;i<=9;i++){
            path.add(i);
            n -=i;
            trans(k,n,i+1);
            n+=i;
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        new L216().combinationSum3(3, 7);
    }
}