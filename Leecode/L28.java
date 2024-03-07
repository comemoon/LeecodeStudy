public class L28 {
    //前缀表（不减一）Java实现
    public void getNext(int[] next,String str){
        int j=0;
        next[0]=0;
        for(int i=1;i<str.length();i++) {
            while (j > 0 && str.charAt(j) != str.charAt(i)) {
                j = next[j - 1];
            }
            if (str.charAt(j) == str.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
    }
    public int kmp(String lonsten,String str){
        int j=0;
        int[] next = new  int[str.length()];
        getNext(next,str);

        for(int i=0;i<lonsten.length();i++){
            while (j>0&&lonsten.charAt(i)!=str.charAt(j)){
                j = next[j-1];
            }
            if(lonsten.charAt(i)==str.charAt(j)){
                j++;
            }
            if(j==str.length()){
                return  i-str.length()+1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        String str = "aabaabaaf";
        String s = "aabaaf";

        int result = new L28().kmp(str,s);
        System.out.println(result);
    }
}