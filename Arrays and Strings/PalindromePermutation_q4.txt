import java.util.HashMap;

public class PalindromePermutation {
    public static void main(String[] args)
    {
        System.out.println(checkPalindromePermutation("tact coa"));
        System.out.println(checkPalindromePermutation("bassdd"));
        System.out.println(checkPalindromePermutation("acbcba"));
    }

    public static boolean checkPalindromePermutation(String pal)
    {
        int countOfOddChars = 0;
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        //Put all characters and their counts in HashMap
        for (Character c: pal.toCharArray())
        {
            if (c == ' ')
                continue;
            if(!hmap.containsKey(c)) {
                hmap.put(c, 1);
            }
            else {
                hmap.put(c, hmap.get(c) + 1);
            }
        }
        //In case of odd character strings, there will be one character with count one and
        // in case of even strings, there will be zero characters with odd count
        for (Character c: hmap.keySet())
            if(hmap.get(c) % 2!=0)
                countOfOddChars += 1;
        if(countOfOddChars == 1 || countOfOddChars == 0)
            return true;
        else
            return false;
    }
    }
