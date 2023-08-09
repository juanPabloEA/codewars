package parseIntReloaded;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    private static Map<String, Integer> intMap = new HashMap<String, Integer>();
   
    
    public static int parseInt(String numStr) {
        intMap.put("one", 1);
        intMap.put("two", 2);
        intMap.put("three", 3);
        intMap.put("four", 4);
        intMap.put("five", 5);
        intMap.put("six", 6);
        intMap.put("seven", 7);
        intMap.put("eight", 8);
        intMap.put("nine", 9);
        intMap.put("zero", 0);
        intMap.put("ten", 10);
        intMap.put("eleven", 11);
        intMap.put("twelve", 12);
        intMap.put("thirteen", 13);
        intMap.put("fourteen", 14);
        intMap.put("fifteen", 15);
        intMap.put("sixteen", 16);
        intMap.put("seventeen", 17);
        intMap.put("eighteen", 18);
        intMap.put("nineteen", 19);
        intMap.put("twenty", 20);
        intMap.put("thirty", 30);
        intMap.put("forty", 40);
        intMap.put("fifty", 50);
        intMap.put("sixty", 60);
        intMap.put("seventy", 70);
        intMap.put("eighty", 80);
        intMap.put("ninety", 90);

        String[] numArr = numStr
            .replaceAll("( and |-)", numStr)
            .split(" ");
        int result = 0;
        int temp = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i].equals("hundred")) {
                temp *= 100;
            } else if (numArr[i].equals("thousand")) {
                result += temp * 1000;
                temp = 0;
            } else if (numArr[i].equals("million")) {
                result += temp * 1000000;
                temp = 0;
            } else {
                temp += intMap.get(numArr[i]);
            }
        }
        return result + temp;
    }
}