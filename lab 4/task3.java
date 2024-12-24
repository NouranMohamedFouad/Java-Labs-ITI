import packageGeneric.*;



class Task3
{
  public static void main(String[] args)
  { 
  
      Complex<Double> c1 = new Complex<Double>(10.0,15.0);    
      Complex<Double> c2 = new Complex<Double>(5.5,17.5);

      Complex<Double> res1 = c1.add(c2); 
      Complex<Double> res2 = c1.subtract(c2);
      Complex<Double> res3 = c1.multiply(c2); 
      Complex<Double> res4 = c1.divide(c2); 
      
      if(res1.getImaginary()<0)
      {
          System.out.println("Addition: " + res1.getReal()+ res1.getImaginary()+"j"); 
      }
      else
      {
          System.out.println("Addition: " + res1.getReal()+"+"+ res1.getImaginary()+"j"); 
      }
      
      if(res2.getImaginary()<0){
          System.out.println("Subtraction: " + res2.getReal()+ res2.getImaginary()+"j"); 
      }
      else{
          System.out.println("Subtraction: " + res2.getReal()+"+"+ res2.getImaginary()+"j"); 
      }
      
      if(res3.getImaginary()<0){
          System.out.println("Multiplication: " + res3.getReal()+ res3.getImaginary()+"j"); 
      }
      else{
          System.out.println("Multiplication: " + res3.getReal()+"+"+ res3.getImaginary()+"j"); 
      }
      
      if(res4.getImaginary()<0){
          System.out.println("Division: " + res4.getReal()+ res4.getImaginary()+"j"); 
      }
      else{
          System.out.println("Division: " + res4.getReal()+"+"+ res4.getImaginary()+"j"); 
      }
      



      
    
  }
}  
  
  
  

  
  
  

