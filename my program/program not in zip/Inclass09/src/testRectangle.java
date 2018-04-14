/******************************************************************************
 * Program Name:          Inclass09 - Two separate classes / TestCylinder
 * Program Description: two separate classes for TestCylinder and TestRectangle
 * Program Author:        Waiyat Hamdani
 * Date Created:          11/15/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
public class testRectangle {
    public static void main(String[] args) {
    
    SimpleRectangle rectangle1 = new SimpleRectangle();
    System.out.println("The area of the rectangle of length "
      + rectangle1.length + " and " + "width " + rectangle1.width + " is " + rectangle1.getArea());

    
    SimpleRectangle rectangle2 = new SimpleRectangle();
    System.out.println("The perimeter of the rectangle of length "
      + rectangle2.length + " and" + "width " + rectangle2.width + " is " + rectangle2.getPerimeter());
    
    SimpleRectangle rectangle3 = new SimpleRectangle();
    System.out.println("The diagonal of the rectangle of length "
      + rectangle3.length + " and " + "width " + rectangle3.width + " is " + rectangle3.getDiagonal());
  }
}

// rectangle class double length and width
class SimpleRectangle {
  double length;
  double width;

  // rectangle with length 10 and width 20 
  SimpleRectangle(){
    length = 10;
    width = 20;
  }

  //rectangle with length and width 
  SimpleRectangle(double newLength, double newWidth) {
    length = newLength;
    width = newWidth;
  }

  double getArea(){
    return length * width;
  }

  
  double getPerimeter(){
    return  (2 * length) + (2 * width);
  }
  
  double getDiagonal(){
    return  Math.sqrt((length * length) + (width * width));
  }

 
  void setRadius(double newLength, double newWidth){
    length = newLength;
    width = newWidth;
  }
}

