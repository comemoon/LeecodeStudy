public class L26{
     public static int removeDuplicates(int[] nums) {
        int slowindex = 0;
        for(int fastindex = 1;fastindex<nums.length;fastindex++){
            if(nums[fastindex]!=nums[slowindex]){
                nums[slowindex+1] = nums[fastindex];
            }
            slowindex++;

        }
        return slowindex+1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        int result = removeDuplicates(nums);
        System.out.println(result);
        System.out.println("这个世界很大，我想去看看");
    }
}