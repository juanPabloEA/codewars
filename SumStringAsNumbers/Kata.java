import static java.lang.Integer.parseInt;
import static org.apache.commons.lang3.StringUtils.leftPad;
import static org.apache.commons.lang3.StringUtils.stripStart;

public class Kata {
    public static String sumStrings(String a, String b ) {
        final var len = Math.max(a.length(), b.length());
        final var x = leftPad(a, len + 1, '0');
        final var y = leftPad(b, len + 1, '0');

        int cur;
        int rem = 0;
        final var result = new StringBuilder(len + 1);
        for (int i = len; i >= 0; i--) {
            cur = parseInt("" + x.charAt(i)) + parseInt("" + y.charAt(i)) + rem;
            result.insert(0, cur % 10);
            rem = cur / 10;
        }
        return stripStart(result.toString(), "0");
    }
}