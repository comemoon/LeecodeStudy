public class L151 {
    public String reverseWords(String s) {
        String result = deletespace(s);
        return result;
    }

    public String deletespace(String s){
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = s.length()-1;
        while(s.charAt(start) == ' '){
            start++;
        }
        while(s.charAt(end) == ' '){
            end--;
        }
        while(start<=end){
            sb.append(s.charAt(start));
            while(s.charAt(start)==s.charAt(start+1)&&s.charAt(start)==' '){
                start++;
            }
            start++;
        }
        return sb.toString();
    }
    public char[] reverseall(String sb){
        char[] result = new char[sb.length()];
        int end = sb.length()-1;
        int rs = 0;
        for(int i=end;i>=0;i--){
            result[rs] = sb.charAt(i);
            rs++;
        }
        return result;
    }
    public String reverseTemp(char[] str){
        int start = 0;
        int end = str.length;
        while(start<end){
            int tempstart = start;
            while(start<end && str[start] != ' '){
                start++;
            }
            int tempend = start-1;
            while(tempstart<tempend){
                char temp = str[tempstart];
                str[tempstart] = str[tempend];
                str[tempend] = temp;
                tempstart++;
                tempend--;
            }
            start++;
        }
        return new String(str);
    }
    public static void main(String[] args) {
        L151 l151 = new L151();
        String s = "   the   sky is blue";
        String re = l151.reverseWords(s);
        System.out.println(re);
        char[] res = l151.reverseall(re);
        System.out.println(res);
        String result = l151.reverseTemp(res);
        System.out.println(result);

    }
}
