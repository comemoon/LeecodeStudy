public class bm22 {
    public static int compare (String version1, String version2) {
        String temp1 = " ";
        String temp2 = " ";
        for (int i = 0; i < version1.length(); i++) {
            char ch = version1.charAt(i);
            if (ch != '0') {
                if (temp1.charAt(temp1.length() - 1) == '.' && ch == '.') {
                    continue;
                }
                temp1 = temp1 + ch;
            }
        }
        for (int i = 0; i < version2.length(); i++) {
            char ch = version2.charAt(i);
            if (ch != '0') {
                if (temp2.charAt(temp2.length() - 1) == '.' && ch == '.') {
                    continue;
                }
                temp2 = temp2 + ch;
            }
        }
        temp1=temp1.trim();
        temp2=temp2.trim();
        if(temp1.charAt(temp1.length()-1)!='.'){
            temp1=temp1+".";
        }
        if(temp2.charAt(temp2.length()-1)!='.'){
            temp2=temp2+".";
        }

        int k = 0;
        int l = 0;
        boolean judge1 = false;
        boolean judge2 = false;
        String part1 = "";
        String part2 = "";
        while (k < temp1.length() && l < temp2.length()) {

            if (temp1.charAt(k) != '.') {
                part1 = part1 + temp1.charAt(k);
                k++;
            } else {
                judge1 = true;
            }
            if (temp2.charAt(l) != '.') {
                part2 = part2 + temp2.charAt(l);
                l++;
            } else {
                judge2 = true;
            }
            if (judge1 == true && judge2 == true) {
                if(part1!=""&&part2!=""){
                    if (Integer.parseInt(part1) > Integer.parseInt(part2)) {
                        return 1;
                    } else if (Integer.parseInt(part1) < Integer.parseInt(part2)) {
                        return -1;
                    }else {
                        part1="";
                        part2="";
                        k++;
                        l++;
                        judge1 = false;
                        judge2 = false;
                    }
                }else {
                   if(part1==""&&part2==""){
                        k++;
                        l++;
                        judge1 = false;
                        judge2 = false;
                   }else if(part1==""){
                        k++;
                   }else{
                        l++;
                   }
                }
            }
        }
        
        if (k == temp1.length() && l == temp2.length()) {
            return 0;
        }
        else if (k < temp1.length()) {
            return 1;
        }
        else {
            return -1;
        }
        // write code here
    }
    public static void main(String[] args) {
        String str1 = "8.6.2.4";
        String str2 = "8.6.3";
        int result = compare(str1, str2);
        System.out.println(result);
    }
}
