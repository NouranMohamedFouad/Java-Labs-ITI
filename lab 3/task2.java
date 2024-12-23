import packageQuadratic.quadratic;
import java.util.function.Function;

class Task2
{
  public static void main(String[] args)
  { 
      if(args.length==0)
      {
          System.out.println("no arguments found!");
      }
      else if(args.length==1 || args.length==2 || args.length>3)
      {
          System.out.println("please pass 3 arguments!");
      }
      else if(args.length==3)
      {   
        try
        {
            quadratic q=new quadratic();
            double a=Double.parseDouble(args[0]);
            double b=Double.parseDouble(args[1]);
            double c=Double.parseDouble(args[2]);
            
            Double coefficients[]=new Double[3];
            
            coefficients[0]=a;
            coefficients[1]=b;
            coefficients[2]=c;
            Double roots[]=q.apply(coefficients);
            if(roots[2]==1.0)
            {
                System.out.println("root 1: "+roots[0]); 
                System.out.println("root 2: "+roots[1]);  
            
            }
            else if(roots[2]==0.0)
            {
                System.out.println("root: "+roots[0]);
            }
            else
            {
                System.out.println("this number is complex");  
            }
        }
        catch(Exception e)
        {
            System.out.println("an error occurred!");
        }
      }
  }
}  
  
  
  

  
  
  

