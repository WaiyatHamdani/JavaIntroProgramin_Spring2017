
package inclass07a;

import java.util.Scanner;
public class Inclass07a {

    
    public static void main(String[] args) {
        //input number array 1
        System.out.print("Enter the amount of numbers in the array:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt( );
        int[]arrayListScore = new int[length];
        
        int i;
        for (i=0;i<length;i++){
       System.out.print("enter a number:");
       arrayListScore[i]=input.nextInt();
        }
        
       // calculation
       
       printscores(arrayListScore);
       System.out.print("average:"+average(arrayListScore));
       printreversesorder(arrayListScore);
       if (length>1){
       System.out.print("next to the last number:");
       }
       
       // printscores ,average,printreverseorder
        
    }

    public static void printscores(int[] arrayListScore) {
       System.out.print("the number are:");
       for(int num : arrayListScore)
       System.out.print(num+"and"+num+"square is"+(int)Math.pow(num,2));
           
    }
private static int average(int[] arrayListScore) {
        int sum=0;
        for(int i=0; i<arrayListScore.length;i++)
            sum += arrayListScore[i];
        return sum/arrayListScore.length;
}
    private static void printreversesorder(int[] arrayListScore) {
      for(int i=0; i>arrayListScore.length;i--)
        System.out.print(arrayListScore[i-1]+"");   
    }

    
        
            
        
    }

