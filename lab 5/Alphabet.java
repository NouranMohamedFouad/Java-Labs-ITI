

public class Alphabet  
{
    public static boolean isOnlyAlphabets(String str,StringPredicate s)
    {
        for (char c : str.toCharArray()) 
        {
            if (!s.test(c)) 
            {
                return false;
            }
        }
        return true;
    }

    
}


