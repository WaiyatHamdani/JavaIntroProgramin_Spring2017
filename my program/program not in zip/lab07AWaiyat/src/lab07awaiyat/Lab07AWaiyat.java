/******************************************************************************
 * Program Name:          Lab07A - Commission calculation 
 * 
 * Program Description:   This program computes the according argument in the....
 *
 * Program Author:        Waiyat Hamdani
 * 
 * Date Created:          11/13/2016
 * 
 * Change#        Change Date      Programmer      Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package lab07awaiyat;


import java.util.Random;
import java.util.Scanner;
public class Lab07AWaiyat {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      int length;

int[] list = new int[50];

Random randomnumber = new Random();

System.out.println("\n Enter list length:");

length = input.nextInt();

for(int i=0;i<length;i++){

int answer = randomnumber.nextInt(length) + 1;

list[i] = answer;

}

System.out.println("\n unsorted list:");

for(int i=0; i<length; i++){

System.out.print("\t" +list[i]);

}

int key = randomnumber.nextInt(length) + 1;

System.out.println("\n key:" + key);

if(linearSearch(key,list,length)){

bubbleSort(list,length,key);

}

}
    
    

public static boolean linearSearch(int key, int[] list, int length){

int index = 0;

while(index < length) {

  if(list[index] == key) {

  System.out.println("\n position of key:" + index);

  return true;

  }

  

index++;

}

return false;

}



public static void bubbleSort( int[ ] list, int size, int key){

   int j;

   boolean flag = true;   

   int temp, length = size;   

   while ( flag ){

   flag= false;

   for( j=0; j < length -1; j++ ){

   if ( list[ j ] > list[j+1] ){

   temp = list[ j ];

   list[ j ] = list[ j+1 ];

   list[ j+1 ] = temp;

   flag = true;

     }

    }

   }

System.out.println("sorted list:");

for(int i=0; i<length; i++){

System.out.print("\t" +list[i]);

}

int index = binarySearch(key,list,length);

System.out.println("\n In binary search key was found at position:" +index);

}




public static int binarySearch(int key, int[] list, int length){

  int low = 0;

  int high = length - 1;

  int middle = 0;

  while(low <= high) {

   middle = low + (high - low) / 2;

   if(list[middle] < key) {

   low = middle + 1;
    }

   
   else if(list[middle] > key) {

   high = middle - 1; 
   }
   
   else

   return middle;

}

return middle;
    }
}