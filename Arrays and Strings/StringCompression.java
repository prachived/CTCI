public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int charCount = 1;
        char currentChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (currentChar == str.charAt(i))
                charCount++;
            else {
                sb.append(currentChar);
                sb.append(charCount);
                currentChar = str.charAt(i);
                charCount = 1;
            }

        }
        sb.append(currentChar);
        sb.append(charCount);

        if(sb.length() <= str.length())
            return sb.toString();
        else
            return str.toString();
    }
}