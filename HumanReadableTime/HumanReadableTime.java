import java.time.Duration;

public class HumanReadableTime {
    
    public static String makeReadable(int seconds) {
        // Do something
        var duration = Duration.ZERO.plusSeconds(seconds);
        return String.format("%02d:%02d:%02d", duration.toHours(),duration.toMinutesPart(), duration.toSecondsPart());
  }
}