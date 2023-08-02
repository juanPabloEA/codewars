package BuildTower;
import static java.util.stream.IntStream.range;

public class Kata {
    public static String[] towerBuilder(int nFloors)
    {
        return range(0, nFloors).mapToObj(i -> String.format("%1$s%2$s%1$s", " ".repeat(nFloors - i - 1), "*".repeat(2 * i + 1))).toArray(String[]::new);
    }
}
