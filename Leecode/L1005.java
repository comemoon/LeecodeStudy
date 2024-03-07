import org.junit.Test;

public class L1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int h=0;h<nums.length;h++){
            sum+=nums[h];
        }
        int y = 0;
        for(int i=0;i<k;i++){
            for(int j=0;j<nums.length;j++){
                int sum2 = sum;
                nums[j] = -nums[j];
                sum2 += 2*nums[j];
                if(sum2>=maxsum){
                    maxsum = sum2;
                    y = j;
                }
                nums[j] = -nums[j];
            }
            nums[y] = -nums[y];
            sum = maxsum;
            maxsum=0;

        }
        return maxsum;
    }
    @Test
    public void test(){
        int[] nums = new int[]{5,6,9,-3,3};
        int result = largestSumAfterKNegations(nums,2);
        System.out.println(result);
    }
}
