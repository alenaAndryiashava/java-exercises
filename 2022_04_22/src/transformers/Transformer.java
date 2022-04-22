package transformers;

public class Transformer {
    public static void main(String[] args) {
        transform("aaa BBBB dEF", new WordsTransformerLowerCase());
        transform("aaa BBBB dEF",new WordsTransformerUpperCase());
        transform("aaa BBBB dEFrt", new WordsTransformerStar());
    }

    public static void transform(String string, WordsTransformer transformer){
        String[] words = string.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (transformer.check(words[i])) {
                words[i] = transformer.transform(words[i]);
            }
            stringBuilder.append(words[i]);
            if (i < words.length-1) {
                stringBuilder.append(" ");
            }
        }

        System.out.println(string + "->" + stringBuilder);
    }
}
