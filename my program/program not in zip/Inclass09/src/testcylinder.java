/******************************************************************************
 * Program Name:          Inclass09 - Two separate classes / TestCylinder
 * Program Description: two separate classes for TestCylinder and TestRectangle
 * Program Author:        Waiyat Hamdani
 * Date Created:          11/15/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
public class testcylinder {
    public static void main(String[] args) {
        // TODO code application logic here
         SimpleCylinder cylinder1 = new SimpleCylinder();
    System.out.println("The surface area of the cylinder of radius "
      + cylinder1.radius + " and " + "height " + cylinder1.height + " is " + cylinder1.getSurfaceArea());

    
    SimpleCylinder cylinder2 = new SimpleCylinder();
    System.out.println("The volume of the cylinder of radius "
      + cylinder2.radius + " and " + "height " + cylinder2.height + " is " + cylinder2.getVolume());  
  }
}

// cylinder class double radius and double height
class SimpleCylinder {
  double radius;
  double height;

  //cylinder with radius 10 and height 30
  SimpleCylinder() {
    radius = 10;
    height = 30;
  }

  //cylinder with a specified radius and height
  SimpleCylinder(double newRadius, double newHeight) {
    radius = newRadius;
    height = newHeight;
  }

  double getSurfaceArea() {
    return (2 * ((Math.PI * Math.pow(radius, 2)))  + (Math.PI * 2 * radius * height));
  }
  
  double getVolume() {
    return  Math.PI*radius*radius*height;
  }
 
  void setRadius(double newRadius, double newHeight) {
    radius = newRadius;
    height = newHeight ;
  }
}
        
    
