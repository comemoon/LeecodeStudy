import javax.management.relation.RelationSupport;
import java.nio.file.ReadOnlyFileSystemException;

import javax.print.attribute.standard.PDLOverrideSupported;

public class L34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid =0 ;
        while(left<right){
            mid = left+(right-left)/2;
            if(nums[mid]==target){
                break;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        if(left<right){
            int before = mid;
            int after = mid;
            boolean isbefore =  true;
            boolean isafter = true;
            while(isbefore==true || isafter==true){
                if(before<0){
                    isbefore = false;
                }else if(nums[before]==target){
                    before--;
                }else {
                    isbefore = false;
                }
                if(after>nums.length-1){
                    isafter = false;
                }else if( nums[after]==target){
                    after++;
                }else {
                    isafter = false;
                }
            }
            return new int[]{before+1,after-1};
        }else{
            return new int[]{-1, -1};
        }
    }
    public static void main(String[] args) {
        int[] input = new int[]{1};
        int target = 1;
        int[] result = searchRange(input, target);
        System.out.println(result);
    }
}