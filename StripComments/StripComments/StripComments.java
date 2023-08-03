package StripComments;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
		String pattern = String.format(
				"[ ]*([%s].*)?$",
				Arrays.stream( commentSymbols ).collect( Collectors.joining() )
		);
		return Arrays.stream( text.split( "\n" ) )
				.map( x -> x.replaceAll( pattern, "" ) )
				.collect( Collectors.joining( "\n" ) );
	}
	
}
