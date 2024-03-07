import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class L76 {
    public static String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        int tlength = t.length();
        String result = s;
        String tempre = "";
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(t.contains(temp+"")&&!map.containsKey(temp)){
                map.put(temp,i);
            }
            tempre +=temp;
            if(map.size()==tlength){
                if(result.length()>tempre.length()){
                    result = tempre;
                    if(i==s.length()-1){
                        break;
                    }
                }
                tempre = "";
                // 使用迭代器获取前两个元素
                Iterator<Map.Entry<Character,Integer>> iterator = map.entrySet().iterator();
                Map.Entry<Character,Integer> entry1 = iterator.next();
                Character tt = entry1.getKey();
                Map.Entry<Character,Integer> entry2 = iterator.next();
                map.remove(tt);
                i = entry2.getValue()-1;
                map.clear();
            }
        }
        if(map.size()==tlength)
            return result;
        else{
            return "";
        }
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println(result);
    }
}
