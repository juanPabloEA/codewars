public class SecureTester{
  
    public static boolean alphanumeric(String s){
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if('0'<=c && c<='9') continue;
            if('a'<=c && c<='z') continue;
            if('A'<=c && c<='Z') continue;
            if(c=='-') continue;
            return false;
            
        }
        return true;
    }
  }