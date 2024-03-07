public class L112 {

 // 创建树
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


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        boolean result = trans(root,targetSum);
        return result;
    }
    private static boolean trans(TreeNode node,int targetSum){
        targetSum -= node.val;
        if(node.left==null&&node.right==null){
            if(targetSum==0){
                return true;
            }else{
                
                return false;
            }

        }
        if(node.left!=null){
            boolean re = trans(node.left,targetSum);
            if(re == false){
                targetSum+=node.left.val;
            }else{
                return true;
            }
        }
        if(node.right!=null){
            boolean re = trans(node.right,targetSum);
            if(re == false){
                targetSum+=node.right.val;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[] input = new Integer[]{0,1,1};
        int targetSum = 0;
        TreeNode node = createTreeFromArray(input);
        boolean  result = hasPathSum(node,targetSum);
        System.out.println(result);
    }
}
