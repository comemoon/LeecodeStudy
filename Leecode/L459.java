import org.junit.Test;

public class L459 {

    @Test
    public void test(){
        String s = "abab";
        boolean result = repeatedSubstringPattern(s);
        System.out.println(result);
    }

    public boolean repeatedSubstringPattern(String s) {
//        if(s.length()%2==1){
//            return false;
//        }
        if(s.length()==2){
            return true;
        }
        for(int i=2;i<=s.length()/2;i++){
            boolean judge = true;
            String temps = s.substring(0,i);
            for(int j=0;j<s.length();j+=i){
                if(j+i>s.length()){
                    judge = false;
                    break;
                }
                if(!s.substring(j,j+i).equals(temps)){
                    judge = false;
                    break;
                }
            }
            if(judge){
                return true;
            }

        }
        return false;
    }
}


