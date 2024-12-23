package packageQuadratic;

import java.util.function.Function;

public class quadratic implements Function<Double[],Double[]>
{
    private Double roots[];
    
    public quadratic(){
        roots=new Double[3];
    }
    
    ////////////////////////////////////////////
    double calcPlusEquation(double a,double b,double number)
    {
    
        return (-b + Math.sqrt(number))/(2*a);
        
    }
    ////////////////////////////////////////////
    double calcMinusEquation(double a,double b,double number)
    {
    
        return (-b - Math.sqrt(number))/(2*a);
        
    }
   //////////////////////////////////////////////
    
    public void getTwoRoots(double a,double b,double c,double number)
    {
      double root1=calcPlusEquation(a,b,number) ;
      double root2=calcMinusEquation(a,b,number);
      roots[0]=root1;
      roots[1]=root2;
      roots[2]=1.0;  
    }
    ///////////////////////////////////////////
    public void getRoot(double a,double b)
    {
        double root=-b/(2*a);
        roots[0]=root;
        roots[1]=root;
        roots[2]=0.0;
    }
    ///////////////////////////////////////////
    public void noRoot()
    {
        roots[0]=0.0;       
        roots[1]=0.0;
        roots[2]=-1.0;   
    }
    //////////////////////////////////////////
    double calcCoefficient(double a,double b,double c){
        return (b*b)-(4*a*c);
    }
    //////////////////////////////////////////
    

    @Override
    public Double[] apply(Double[] nums) 
    { 
        double a=nums[0];
        double b=nums[1];
        double c=nums[2];
        
        double number=calcCoefficient(a,b,c);
        
        if (number>0) 
        {
            getTwoRoots(a,b,c,number);
        } 
        else if(number==0)
        {
            getRoot(a,b);    
        } 
        else 
        {
            noRoot();   
        }
        return roots;
    }
}
