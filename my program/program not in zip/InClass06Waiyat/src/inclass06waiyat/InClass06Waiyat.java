/******************************************************************************
 * Program Name:          In Class 06
 * Program Description: Write a Java program that reads two numbers from the consol
 * Program Author:        Waiyat Hamdani
 * Date Created:         10/22/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package inclass06waiyat;
import java.util.Scanner;
public class InClass06Waiyat {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

       System.out.println("The minimum of " + num1 + " and " + num2 + " is "
                + min(num1, num2));

       System.out.println("The maximum of " + num1 + " and " + num2 + " is "
                + max(num1, num2));

       System.out.println("The sum of " + num1 + " and " + num2 + " is "
                + sum(num1, num2));

       System.out.println("The difference of " + num1 + " and " + num2
                + ", , rounded to the nearest whole integer, is "
                + difference(num1, num2));

       System.out.println("The product of " + num1 + " and " + num2 + " is "
                + product(num1, num2));

       

   }

    static double product(double n1, double n2) {
        return n1 * n2;
    }

    static double sum(double n1, double n2) {
        return n1 + n2;
    }


    static int difference(double n1, double n2) {
        double diff;
        diff = n1 - n2;
        diff = Math.abs(diff);
        int intDiff = (int) Math.round(diff);
        return intDiff;
    }
    static double max(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

   static double min(double n1, double n2) {
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }
 }

    
    

