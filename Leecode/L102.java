import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class L102 {

 

    public static List<List<Integer>> resList = new ArrayList<List<Integer>>();

    public static List<List<Integer>> levelOrder(TreeNode root) {
        checkFun01(root,0);

        return resList;
    }

    //DFS--递归方式
    public static void checkFun01(TreeNode node, Integer deep) {
        if(node==null) return;

        deep++;
        if(resList.size()<deep){
            List<Integer> temp = new ArrayList<>();
            resList.add(temp);
        }
        resList.get(deep-1).add(node.val);
        checkFun01(node.left,deep);
        checkFun01(node.right,deep);
    }
    public static TreeNode createTreeFromArray(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return createTreeFromArrayHelper(arr, 0);
    }
    
    public static  TreeNode createTreeFromArrayHelper(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }
        TreeNode node = new TreeNode(arr[index]);
        node.left = createTreeFromArrayHelper(arr, 2 * index + 1);
        node.right = createTreeFromArrayHelper(arr, 2 * index + 2);
        return node;
    }
    public static void main(String[] args) {
        Integer[] input = new Integer[]{3,9,20,null,null,15,7};
        TreeNode node = createTreeFromArray(input);
        List<List<Integer>> result = levelOrder(node);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
