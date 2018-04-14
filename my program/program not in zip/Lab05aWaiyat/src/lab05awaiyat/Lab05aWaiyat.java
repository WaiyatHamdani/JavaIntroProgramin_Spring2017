/******************************************************************************
 * Program Name:          Lab05a -converts a decimal integer between 0 and 255 to binary
 * Program Description: converts a decimal integer between 0 and 255 to binary
 * Program Author:        Waiyat Hamdani
 * Date Created:         10/17/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package lab05awaiyat;
import java.util.Scanner;
public class Lab05aWaiyat {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//input decint,bit and quotient
int decInt, bit8,bit7,bit6,bit5,bit4,bit3,bit2,bit1;
double quotient;

System.out.println("Enter an integer between 0-255, or 999 to exit:");
decInt=input.nextInt();

//while is not 999
while(decInt!=999) {
while(decInt < 0 || decInt > 255){
System.out.println("Entry out of bounds. Please re-enter:");
System.out.println("Enter an integer between 0-255, or 999 to exit:");
decInt = input.nextInt();
}

// Bit and quotient
bit8=  decInt %2;
quotient = (double)decInt/2;
bit7 = (int)quotient %2;
quotient = quotient /2;	
bit6 = (int)quotient %2;
quotient = quotient /2;	
bit5 = (int)quotient %2;
quotient = quotient /2;
bit4 = (int)quotient %2;
quotient = quotient /2;	
bit3 = (int)quotient %2;
quotient = quotient /2;	
bit2 = (int)quotient %2;
quotient = quotient /2;
bit1 = (int)quotient %2;

System.out.println("\nDecimal=" +decInt);
System.out.println("\nBinary=" + bit1 + bit2 + bit3 + bit4 + bit5 + bit6  + bit7 + bit8 );
System.out.println("\nEnter an integer between 0-255, or 999 to exit:" );
decInt = input.nextInt();
}
//output Ending
System.out.println("program ending!");
}
}


