import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        Map<String, Long> str1Map = Stream.of(str1.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<String, Long> str2Map = Stream.of(str2.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return str2Map.entrySet().stream().allMatch(e -> str1Map.get(e.getKey()) != null && e.getValue() <= str1Map.get(e.getKey()));
    }
}