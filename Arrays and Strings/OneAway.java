public class OneAway {
public static void main(String[] args)
{
    System.out.println(checkOneAway("pale", "ple"));
    System.out.println(checkOneAway("pales","pale"));
    System.out.println(checkOneAway("pale","bale"));
    System.out.println(checkOneAway("pale","bae"));
}

public static boolean checkOneAway(String str1, String str2)
{
    if(str1.length() == str2.length())
    {
        return checkReplaceCondition(str1, str2);
    }
    else if(str1.length() + 1 == str2.length())
    {
        return checkInsertRemoveCondition(str1,str2);
    }
    else if (str1.length() - 1 == str2.length())
    {
        return checkInsertRemoveCondition(str2,str1);
    }
    return false;
}


public static boolean checkReplaceCondition(String str1, String str2)
{
    int differentCharCount = 0;
    for(int i = 0; i< str1.length();i++)
    {
        if (str1.charAt(i) == str2.charAt(i))
            continue;
        else
            differentCharCount +=1;
    }
    if (differentCharCount == 1)
        return true;
    else
        return false;
}

public static boolean checkInsertRemoveCondition(String str1, String str2)
{
    int editedCharacters = 0;
    int i = 0, j = 0;
    while (i < str1.length() && j < str2.length() )
    {
        if (str1.charAt(i) == str2.charAt(j))
        {
            i+=1;
            j+=1;
        }
        else {
            editedCharacters += 1;
            if(editedCharacters > 1)
                return false;
            j+=1;
        }
    }
        return true;
}
}
