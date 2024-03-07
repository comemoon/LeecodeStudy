import org.junit.Test;

public class L376 {
    @Test
    public void test(){
        int [] nums = new int[]{3,3,3,2,5};
        int result = wiggleMaxLength(nums);
        System.out.println(result);
    }
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2&&nums[0]!=nums[1]){
            return 2;
        }
        int number = 0;
        int start = nums[0];
        int i=1;
        while(i<nums.length){
            if(number%2==0&&nums[i]>start){
                number++;
                start=nums[i];
            }
            else if(number%2==1&&nums[i]<start){
                number++;
                start = nums[i];
            }
            i++;
        }
        return number+1;
    }
}
