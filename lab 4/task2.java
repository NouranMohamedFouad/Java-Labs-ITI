import packageShape.*;

import java.util.ArrayList;
import java.util.List;

class Task2
{
  public static void main(String[] args)
  { 
        List<rectangle> rectangles = new ArrayList<rectangle>();
        rectangles.add(new rectangle());
        rectangles.add(new rectangle());


      List<circle> circles = new ArrayList<>();
      circles.add(new circle());
      circles.add(new circle());
      
      shapeTest test=new shapeTest();

      System.out.println("Drawing Rectangles:");
      test.drawShape(rectangles);

      System.out.println("Drawing Circles:");
      test.drawShape(circles);
      
      //this is an abstract class,cannot be instantiated ,must be a concrete class not abstract
      List<shape> shapes = new ArrayList<shape>();
      shapes.add(new circle());
      shapes.add(new rectangle());
      
      System.out.println("Drawing Shapes:");
      test.drawShape(shapes);
      
      
    
  }
}  
  
  
  

  
  
  

