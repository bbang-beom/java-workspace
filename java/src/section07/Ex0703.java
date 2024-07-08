package section07;

public class Ex0703 {
    public static void main(String[] args) {
        char[] words = {'1', 'J', '2', 'A', '3', 'V', '4', 'A'};
        String resultWord = "";

        for (int i = 0; i < words.length; i++) {
          if ((int)words[i] > 64 && (int)words[i] < 91) {
            resultWord += words[i];
          } 
        }
        System.out.println(resultWord);

        resultWord = "";

        for (char word : words) {
            if (word > 64 && word < 91) {
                resultWord += word;
              } 
        }
        System.out.println(resultWord);
    }
}
