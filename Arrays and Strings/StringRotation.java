public class StringRotation {
    public static void main(String[] args)
    {
        System.out.println(rotateString("waterbottle","erbottlewat"));
    }

    static boolean rotateString(String str1, String str2)
    {
        int str1len = str1.length();
        if (str1len == str2.length() && str1len > 0)
        {
            String str12 = str1 + str1;
            return isSubstring(str12,str2);
        }
        return false;
    }

    static boolean isSubstring(String str2, String str1)
    {
        return str2.contains(str1);
    }
}