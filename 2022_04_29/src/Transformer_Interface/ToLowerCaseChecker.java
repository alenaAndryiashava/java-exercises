package Transformer_Interface;

public class ToLowerCaseChecker implements WordsChecker{
    @Override
    public boolean checkWord(String string) {
        return string.length()==2;
    }

    @Override
    public String transform(String string) {
        return string.toLowerCase();
    }
}
