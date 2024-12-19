import java.util.regex.*;

class Task3
{
  public static void main(String[] args)
  {
      if(args.length==0)
      {
          System.out.println("no IP found!");
      }
      else if(args.length>=2)
      {
          System.out.println("please only 1 argument is accepted!");
      }
      else if(args.length==1)
      {   
          String[] parts = args[0].split("\\.");
          System.out.println("The parts of the IP address are:");
      
          

          String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\."
                         + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\."
                         + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\."
                         + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";
          
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(args[0]);

            if (matcher.matches()) 
            {
                System.out.println(args[0]+" is a valid IP address");
            } 
            else
            {
                for (int i=0;i<parts.length;i++)
                {
                      System.out.println(parts[i]);
                }
                System.out.println(args[0]+" is not a valid IP address");
            }
      }
  }
}  
  
  
  

