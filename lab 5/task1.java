

class task1
{

  public static void main(String[] args)
  { 
    String str1 = "ITI";
    String str2 = "9 Months!";
    betterString betterStr=(s1,s2) -> s1.length()<s2.length();
    if(betterStr.isBetter(str1,str2))
    {
        System.out.println("string 2 is longer than string 1");
    }
    else
    {
        System.out.println("string 2 is longer than string 1");
    }
    
    
    betterString betterStr2=(s1,s2) -> true;
    if(betterStr2.isBetter(str1,str2))
    {
        System.out.println("printing string 1");
    }
    else
    {
        System.out.println("printing string 2");
    }
    
    
  }
  
}
