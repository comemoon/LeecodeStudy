import java.util.*;

public class L77 {
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<List<Integer>>();
        path = new ArrayList<Integer>();
        trans(n,k,1);
        return result;
    }

    private List<List<Integer>> result;
    private List<Integer> path;
    private void trans(int n,int k,int startindex){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startindex;i<=n;i++){
            path.add(i);
            trans(n,k,i+1);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        List<Integer> ae = new ArrayList<>();
        ae.add(1);
        ae.add(2);
        System.out.println(ae);
        List<Integer> ae2 = new ArrayList<>(ae);
        System.out.println(ae2);
    }
}