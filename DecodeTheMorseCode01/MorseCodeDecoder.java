package DecodeTheMorseCode01;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    private static final String WORD_DELIMITER = "   ";
    private static final String LETTER_DELIMITER = " ";
    
    
    public static String decode(String morseCode) {
        Pattern pattern = Pattern.compile(WORD_DELIMITER);
        return pattern.splitAsStream(morseCode.trim())
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String word) {
        Pattern pattern = Pattern.compile(LETTER_DELIMITER);
        return pattern.splitAsStream(word).map(MorseCode::get).collect(Collectors.joining());
    }
}