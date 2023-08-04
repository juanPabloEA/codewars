import java.util.Arrays;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        StringBuilder resBuilder = new StringBuilder(str1);
        for (char letter : str2.toCharArray()) {
            int index = resBuilder.indexOf(letter + "");
            if (index == -1) {
                return false;
            }
            resBuilder.replace(index, index + 1, "");
        }
        return str1.length() - str2.length() == resBuilder.length();
    }
}