public class L541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int len = s.length();
        int index = 0;
        while(len-index>0){
            index += 2*k;
            if((index-k)<=s.length())
                ch = trans(ch,index-2*k,index-k);

        }
        if(s.length()!=k){
            int re = (s.length()%(2*k));
            int start = s.length()-re;
            if(re<k){
                ch = trans(ch,start,s.length());
            }
        }
        return new String(ch);
    }
    private char[] trans(char[] s,int start,int end){
        for(int i=start,j=end-1;i<j;i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2;
        String result = new L541().reverseStr(s,k);
        System.out.println(result);
    }
}