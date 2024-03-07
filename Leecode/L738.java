import org.junit.Test;

public class L738 {
    public int monotoneIncreasingDigits(int n) {
        for(int i=n;i>=0;i--){
            String strint = i+"";
            int temp = (int)strint.charAt(strint.length()-1);
            int j = strint.length()-2;
            for(;j>=0;j--){
                int te = (int)strint.charAt(j);
                if(te<=temp){
                    temp=te;
                }else{
                    break;
                }
            }
            if(j<0){
                return i;
            }
        }
        return -1;
    }
    public int monotoneIncreasingDigits2(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int start = s.length();
        for (int i = s.length() - 2; i >= 0; i--) {
            if (chars[i] > chars[i + 1]) {
                chars[i]--;
                start = i+1;
            }
        }
        for (int i = start; i < s.length(); i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(String.valueOf(chars));
    }
    @Test
    public void test(){
//        int result = monotoneIncreasingDigits(777616726);
//        System.out.println(result);
        char[] result2 = {'3','6','8'};
        System.out.println(result2[1]<result2[2]);
        result2[1]--;
        System.out.println(result2[1]);
    }
    @Test
    public void test2(){
        int result = monotoneIncreasingDigits2(33322);
        System.out.println(result);
    }
}
