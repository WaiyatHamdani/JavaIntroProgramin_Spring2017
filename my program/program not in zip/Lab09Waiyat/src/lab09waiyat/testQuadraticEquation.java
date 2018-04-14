/******************************************************************************
 * Program Name:          Lab09 - TestQuadratic equation/quadratic Equation
 * Program Description: two separate classes for TestQuadratic equation and quadratic Equation
 * Program Author:        Waiyat Hamdani
 * Date Created:          11/17/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package lab09waiyat;
import java.util.Scanner;
public class testQuadraticEquation {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int a,b,c;
     
     System.out.print("Enter 3 coeficients(a,b,c):");
     a=input.nextInt();
     b=input.nextInt();
     c=input.nextInt();
        
quadraticEquation test=new quadraticEquation(a, b, c);
if(test.getRoot1()==0 && test.getRoot2()==0)System.out.println("The equation has no roots");
System.out.println(test.getRoot1()+" "+test.getRoot2());
  
        
    }
}
