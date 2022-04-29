package Transformer_Interface;

public class Transformer {
    public String transform(String sentence, WordsChecker wordsChecker){
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length ; i++) {
            if (wordsChecker.checkWord(words[i])) {
                words[i] = wordsChecker.transform(words[i]);
            }
        }
        return String.join(" ",words);
    }
}
