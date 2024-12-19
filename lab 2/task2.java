import java.util.StringTokenizer;

class Task2
{
  public static int countUsingIndexOf(String sentence, String word) 
  {
        int count=0;
        int index=0;
        while ((index = sentence.indexOf(word,index))!=-1)
        {                           
            count++;
            index+=word.length();
        }
        return count;
  }
  ///////////////////////////////////////////////////////////////////////
  public static int countUsingSplit(String sentence, String word) 
  {
        String[] parts=sentence.split("\\b"+word+"\\b"); 
        int totalOccurance=parts.length-1;
        return totalOccurance;
  }
  ///////////////////////////////////////////////////////////////////////
  public static int wordTokenizers(String sentence, String word) 
  {
        StringTokenizer tokenizer=new StringTokenizer(sentence,word);
        int count=tokenizer.countTokens()-1;
        return count;
  }
  ///////////////////////////////////////////////////////////////////////
  public static void main(String[] args)
  {
      String sentence = "ITI develops people and ITI house of developers and ITI for people ";
        
      if(args.length==0)
      {
          System.out.println("no word found!");
      }
      else if(args.length>=2)
      {
          System.out.println("please only 1 argument!");
      }
      else if(args.length==1)
      {   
        try
        {
            String word=args[0];
            int count1=countUsingSplit(sentence,word);
            System.out.println("Count by split:"+count1);
            
            int count2=countUsingIndexOf(sentence,word);
            System.out.println("Count by indexOf:"+count2);   
            
             int count3=wordTokenizers(sentence,word);
            System.out.println("Count of tokenizers:"+count3);   
      
        }
        catch(Exception e)
        {
            System.out.println("an error occurred!");
        }
      }
  }
}  
  
  
  

