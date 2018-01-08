import java.util.HashSet;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args)
    {
        System.out.println(checkuniquechars("qwerty"));
        System.out.println((checkuniquechars("")));
        System.out.println((checkuniquechars("abcba")));
    }

    public static boolean checkuniquechars(String test)
    {
        Set<Character> unichar = new HashSet<Character>();
        if (test.length() == 0)
            return true;
        for (Character c: test.toCharArray())
        {
            if (unichar.contains(c))
            {
                return false;
            }
            unichar.add(c);
        }
            return true;
    }
}
