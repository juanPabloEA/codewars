package TheObservedPIN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ObservedPin {
    private static String[][] keyboard = new String[][] {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" },
            { "", "0", "" }
    };
    public static List<String> getPINs(String observed) {
        List<String> pChar = Arrays.asList(observed.split(""));
        List<List<String>> result = new java.util.ArrayList<List<String>>();

        for (String key : pChar) {
            result.add(getTheButtonAround(key));
        }

        return generateCombinations(result, 0);
    } 

    public static List<String> generateCombinations(List<List<String>> matrix, int index) {
        List<String> combinations = new ArrayList<>();
        
        if (index == matrix.size()) {
            combinations.add("");
            return combinations;
        }
        
        List<String> currentList = matrix.get(index);
        List<String> restCombinations = generateCombinations(matrix, index + 1);

        for (String item : currentList) {
            for (String rest : restCombinations) {
                combinations.add(item + rest);
            }
        }

        return combinations;
    }
    
     private static List<String> getTheButtonAround(String key) {
        for (int row = 0; row < keyboard.length; row++) {
            for (int col = 0; col < keyboard[row].length; col++) {
                if (key.equals(keyboard[row][col])) {
                    return Arrays.asList(
                            row - 1 >= 0 ? keyboard[row - 1][col] : "",
                            row + 1 < keyboard.length ? keyboard[row + 1][col] : "",
                            col - 1 >= 0 ? keyboard[row][col - 1] : "",
                            col + 1 < keyboard[row].length ? keyboard[row][col + 1] : "",
                            keyboard[row][col]).stream()
                            .filter(s -> !s.equals(""))
                            .collect(Collectors.toList());
                }
            }
        }
        return new ArrayList<String>();
    }

} // ObservedPin
