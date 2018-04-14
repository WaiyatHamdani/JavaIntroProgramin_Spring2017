
package inclass07a;

import java.util.Scanner;


public class array2 {
     public static void main(String[] args) {
         //input number array 2
         System.out.print("Enter the amount of numbers in the array:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt( );
        int[]arrayListmax = new int[length];
        
        int i;
        for (i=0;i<length;i++){
       System.out.print("enter a number:");
       arrayListmax[i]=input.nextInt();
        }
        //while is not 999
        System.out.println("or 999 to exit:");
       length =input.nextInt();
        while(length!=999) {
        while( length< 0 || length > 998){  // the program ending
               
        }
     }

       
}
}