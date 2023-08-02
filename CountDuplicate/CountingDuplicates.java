import java.util.Map;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountingDuplicates {
    private static Map<Character, Long> charFrequenciesMap(final String text) {
        return text.codePoints()
            .map(Character::toLowerCase)
            .mapToObj(c -> (char) c)
            .collect(groupingBy(identity(), counting()));
    }
    public static int duplicateCount(String text) {
        // Write your code here
        return (int) charFrequenciesMap(text).values().stream()
            .filter(i -> i > 1)
            .count();
    }
  }