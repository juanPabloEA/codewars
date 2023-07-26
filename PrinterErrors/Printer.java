import java.util.Arrays;

public class Printer {
    
    public static String printerError(String s) {
        Long errors = s.chars().filter(c -> c > 109).count();
        return errors + "/" + s.length();
    }
}