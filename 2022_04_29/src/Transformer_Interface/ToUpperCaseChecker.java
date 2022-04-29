package Transformer_Interface;

import java.util.Locale;

public class ToUpperCaseChecker implements WordsChecker{
    @Override
    public boolean checkWord(String string) {
        return string.length()==3;
    }

    @Override
    public String transform(String string) {
        return string.toUpperCase();
    }
}
