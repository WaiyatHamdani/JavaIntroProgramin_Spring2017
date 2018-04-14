/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;


public class InsertionSort {


    public static void main(String[] args) {
        // TODO code application logic here
         final int NUMBER_OF_GRADES = 10;                    
    int randomGradesIS[] = new int [NUMBER_OF_GRADES];
    System.out.print("\nRandom grades unsorted: ");
    for (int i = 0 ; i < NUMBER_OF_GRADES ; i++)   
      randomGradesIS[i] = (int) (Math.random () * 101); 
    for (int i = 0 ; i < NUMBER_OF_GRADES ; i++)   
      System.out.print(randomGradesIS[i] + " ");
    insertionSort(randomGradesIS);
    System.out.print("\nRandom grades sorted:   ");
    for (int i = 0 ; i < NUMBER_OF_GRADES ; i++)  
        System.out.print(randomGradesIS[i] + " ");
    System.out.println();           
  }
   
  public static void insertionSort(int[] arrayIS) {
    int j;  // the number of items sorted so far
    int key;  // the item to be inserted
    int i; 
    for (j = 1; j<arrayIS.length; j++) {    // Start with 1 (not 0)
      key = arrayIS[j];
      for(i = j - 1;(i >= 0) && (arrayIS[i] > key); i--)  // Smaller values are moving up
        arrayIS[i + 1] = arrayIS[i];
      arrayIS[i + 1] = key;    // Put the key in its proper location
    }
  }
}
    