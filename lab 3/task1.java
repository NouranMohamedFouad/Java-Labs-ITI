import packageConvert.convert;

import java.util.function.Function;
class task1
{ 
  ///////////////////////////////////////////////
  public static void main(String[] args)
  { 
        convert c=new convert();
        double number=c.apply(20.0);
        System.out.println(" 20 Centigrade to Fahrenheit: "+number);  
  }
  
}
