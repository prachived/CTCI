public class URLify {
    public static void main(String args[])
    {
        System.out.println(urlify("John Smith  ",13));
    }

    public static String urlify(String str, int length) {
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; ++i) {
            sentence.append("%20");
            sentence.append(words[i]);
        }

        return sentence.toString();
    }
}
