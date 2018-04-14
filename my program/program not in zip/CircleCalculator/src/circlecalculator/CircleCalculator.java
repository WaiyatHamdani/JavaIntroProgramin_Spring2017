/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecalculator;
import java.util.Scanner;

public class CircleCalculator {
static Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double radius= 2;
        //Scanner s= new Scanner(System.in);
          String more ="y";
          while(more.equalsIgnoreCase("y")){ 
            System.out.println("Enter he radius of the circle:");
                double radius=s.nextDouble();
                //double area = Math.PI *radius*radius;
                //double circomference= Math.PI*radius*2;
                System.out.println("radius:"+radius);
                System.out.println("area:"+getArea(radius));
                System.out.println("circomference:"+getCircomference(radius));

          System.out.println("would you like to continue? y for yes and n for no");    
          more=s.next();
        }   
    }
    public static double getArea(double radius){
        return Math.PI * radius * radius;
     }  
    
    public static double getCircomference (double radius){
        return Math.PI*radius*2;
    
    }
    public static double getRadius(double radius){
        //static Scanner s = new Scanner(System.in);
        return s.nextDouble();
    }
    public static double getOutput(double radius){
        StringBuilder builder = new StringBuilder(64);
        builder.append("Radius:");
        builder.append(radius);
        builder.append("\nArea:");
        builder.append(getArea(radius));
        
    }
}