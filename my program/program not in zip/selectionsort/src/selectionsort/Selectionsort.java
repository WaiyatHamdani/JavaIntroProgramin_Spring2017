/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Arrays;
public class Selectionsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    int[] arrayints = {95, 100, 65, 88, 76, 0, 55, 100, 77,0}; 
    selectionSort(arrayints);
    System.out.println("SS1: " + Arrays.toString(arrayints));
  }

  public static void selectionSort (int[] arraySS1)  {
    int i, j, first, temp;  
    for (i=arraySS1.length-1; i>0; i--) {
      first = 0;   //initialize to index of first element
      for(j = 1; j <= i; j++) {   //locate largest element between positions 1 and i.
        if( arraySS1[j] > arraySS1[first])         
           first = j;
      }
      temp = arraySS1[first];   //swap largest found with element in position i.
      arraySS1[first] = arraySS1[i];
      arraySS1[i] = temp; 
      }           
  }
}
   