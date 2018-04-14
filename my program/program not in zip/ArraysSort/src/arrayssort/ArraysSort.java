/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayssort;


public class ArraysSort {

    public static void main(String[] args) {
        // TODO code application logic here
          double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.print("The sorted array of doubles using the sort utility is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
        System.out.print("\nThe sorted array of chars using the sort utility is: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }
        
        String[] strings = {"Baker", "Abel", "Harris", "Davis"};
        Arrays.sort(strings);
        System.out.print("\nThe sorted array of strings using the sort utility is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
    
}
