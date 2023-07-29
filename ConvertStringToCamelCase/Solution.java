package ConvertStringToCamelCase;
class Solution{

  static String toCamelCase(String s){
    String [] words = s.split("[-_]");
    StringBuilder res = new StringBuilder(words[0]);

    for (int i = 1; i < words.length; i++) {
      res.append(words[i].substring(0,1).toUpperCase());
      res.append(words[i].substring(1));
    }

    return res.toString();
  }
}