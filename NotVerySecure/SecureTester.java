public class SecureTester{
  
    public static boolean alphanumeric(String s){
        if (s == null || s.isEmpty()) {
            return false;
        }
        
        return s.replaceAll("[^a-zA-Z0-9]", "").length() == s.length();
    }
  }