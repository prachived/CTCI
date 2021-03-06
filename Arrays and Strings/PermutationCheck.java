import java.util.HashMap;

public class PermutationCheck {
    public static void main(String args[])
    {

        System.out.println(checkPermutationOfAnother("abc", "cba"));
        System.out.println(checkPermutationOfAnother("asd","dfg"));
    }

    public static boolean checkPermutationOfAnother(String str1, String str2)
    {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        if (str1.length()!= str2.length())
            return false;
        for (Character c: str1.toCharArray())
        {
            if (!hmap.containsKey(c))
            {
                hmap.put(c,1);
            }
            else
            {
                hmap.put(c,hmap.get(c) + 1);
            }
        }

        for (Character c: str2.toCharArray())
        {
            if(!hmap.containsKey(c))
                return false;
            else
                hmap.put(c,hmap.get(c) - 1);
        }

        for (Character c: hmap.keySet())
            if (hmap.get(c) != 0)
                return false;
        return true;
    }
}
