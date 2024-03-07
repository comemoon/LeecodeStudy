public class L69 {
    public static  int mySqrt(int x) {
        if(x==1||x==2) return 1;
        int left = 0;
        int right = x;
        while(left<right){
            int mid = left + (right-left)/2;
            long  temp1 = mid*mid;
            if(temp1>x){
                long temp2 = (mid-1)*(mid-1);
                if(temp2<=x){
                    return mid-1;
                }else{
                    right = mid;
                }

            }else if(mid*mid == x){
                return mid;
            } else {
                left = mid+1;
            } 
        }
        return 0;
    }
    public static void main(String[] args) {
        int x = 2147395599;
        // int y = 1073697799;
        // System.out.println(y*y);
        int result = mySqrt(x);
        System.out.println(result);
    }
}
