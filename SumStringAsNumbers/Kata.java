public class Kata {
    public static String sumStrings(String a, String b ) {
        boolean am = a.matches("[0-9]+");
        boolean bm = b.matches("[0-9]+");
        
        if (am && bm) {
            try {
                return String.valueOf(Long.parseLong(a) + Long.parseLong(b));
            } catch (NumberFormatException e) {
                return bigSum(a, b);
            }    
            return String.valueOf(Long.parseLong(a) + Long.parseLong(b));
        }
        return "0";
    }

    public static String bigSum(String a, String b) {
        int[] a1 = new int[a.length()];
        int[] b1 = new int[b.length()];

        for (int i = 0; i < a.length(); i++) {
            a1[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        for (int i = 0; i < b.length(); i++) {
            b1[i] = Integer.parseInt(String.valueOf(b.charAt(i)));
        }

        int[] c = new int[Math.max(a1.length, b1.length) + 1];

        for (int i = 0; i < c.length; i++) {
            int ai = a1.length - i - 1;
            int bi = b1.length - i - 1;
            int ci = c.length - i - 1;

            if (ai >= 0 && bi >= 0) {
                c[ci] += a1[ai] + b1[bi];
            } else if (ai >= 0) {
                c[ci] += a1[ai];
            } else if (bi >= 0) {
                c[ci] += b1[bi];
            }

            if (c[ci] > 9) {
                c[ci] -= 10;
                c[ci - 1] += 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (i == 0 && c[i] == 0) {
                continue;
            }
            sb.append(c[i]);
        }

        return sb.toString();
    }
}