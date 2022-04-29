package transformers;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    private Transformer transformer = new Transformer();


    @Test
    public void transformer_lower_case() {
        String actual = "aaa BBBB dEFrt";
        String expected = "aaa bbbb dEFrt";

        assertEquals(expected,transformer.transform(actual,new WordsTransformerLowerCase()));
    }
    @Test
    public void check_Length_lower_case(){
        WordsTransformerLowerCase wordsTransformerLowerCase = new WordsTransformerLowerCase();
        assertFalse(wordsTransformerLowerCase.check("aaa"));
        assertTrue(wordsTransformerLowerCase.check("BBBB"));
    }

    @Test
    public void transformer_upper_case() {
        String actual = "aaa BBBB dEFrt";
        String expected = "AAA BBBB dEFrt";
        assertEquals(expected,transformer.transform(actual,new WordsTransformerUpperCase()));
    }

    @Test
    public void transformer_star_case() {
        String actual = "aaa BBBB dEFrt";
        String expected = "aaa BBBB *****";
        assertEquals(expected, transformer.transform(actual, new WordsTransformerStar()));
    }
}