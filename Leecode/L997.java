

public class L997 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(result[i]);
        }
    }
}
