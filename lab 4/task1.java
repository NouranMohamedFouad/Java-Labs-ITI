import packageException.customException;
import packageException.calculator;

class task1
{ 
  public static void main(String[] args)
  { 
        calculator c=new calculator();
        try
        {
            if(args.length==0)
            {
                System.out.println("no arguments found!");
            }
            else if(args.length==1)
            {
                System.out.println("please pass another argument!");
            }
            else if(args.length==2)
            {  
                c.isNull(args[0]);
                int number1=Integer.parseInt(args[0]);
                
                c.isNull(args[1]);
                int number2=Integer.parseInt(args[1]);
                
                c.isNegative(number1);
                c.isNegative(number2);
                
                c.isZero(number2);
                
                System.out.println("division of the 2 numbers = "+c.divide(number1,number2)); 
            }
            else if(args.length > 2)
            {  
                  System.out.println("please only pass 2 arguments !");  
            }
        }
        catch(NullPointerException msg)
        {
            System.out.println(msg); 
        }
        catch(NumberFormatException msg)
        {
            System.out.println("argument must be an number"); 
        }
        catch(ArithmeticException msg)
        {
            System.out.println(msg); 
        }
        catch(customException msg)
        {
            System.out.println(msg); 
        }
        finally
        {
            System.out.println("this is the end of the program!"); 
        }
  }
}
