/******************************************************************************
 * Program Name:          Lab 06a
 * Program Description: Lab6a
 * Program Author:        Waiyat Hamdani
 * Date Created:         10/27/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package lab06awaiyat;
import java.util.Scanner;
public class Lab06aWaiyat {

    public static void main(String[] args) {
    // input 
    Scanner input= new Scanner(System.in);
    int Number;
    System.out.print("Enter a positive multi-digit integer:"); 
    Number =input.nextInt();
   
    // true or false
    while (Number<=9){
    System.out.print(Number + "Is one digit.please enter a multi-digit positive integer:");
    Number=input.nextInt();
    
        if (Number < 0){
        System.out.print(Number + "Is negative.please enter a multi-digit positive integer:"); 
        Number=input.nextInt();
        }
        else{
        System.out.print("Enter a positive multi-digit integer:");
        Number=input.nextInt(); 
        }  
       
    }
    if(isPalindrome(Number)==true){
        System.out.print(Number+ "is palindrome");
    }
    else{
        System.out.print(Number+"is not palndrome");
        
        }
    }
        
   //reverse

     static int reverse(int Number) {
        int result = 0;
        while(Number < 0 || Number > 0){
            int remainder = Number % 10;
            result = result * 10 + remainder;
            Number= Number/10;
        }
        return result;
    }
    public static boolean isPalindrome(int Number){
        return Number == reverse(Number);
    
    }
    }
    

