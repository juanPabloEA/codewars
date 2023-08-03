package StripComments;
import java.util.Arrays;
import java.util.List;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
		return Arrays.stream(text.split("\n"))
			.map(line -> {
				final int index = Arrays.stream(commentSymbols)
					.map(line::indexOf)
					.filter(i -> i > -1)
					.min(Integer::compare)
					.orElse(-1);
				return index > -1 ? line.substring(0, index) : line;
			})
			.map(line -> line.replaceAll("\\s+$", ""))
			.reduce((a, b) -> a + "\n" + b)
			.get();
	}
	
}
