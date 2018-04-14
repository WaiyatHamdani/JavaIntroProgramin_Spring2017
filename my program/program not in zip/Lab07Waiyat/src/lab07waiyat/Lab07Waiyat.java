/******************************************************************************
 * Program Name:          Lab 07
 * Program Description: Student Grades Array Programs
 * Program Author:        Waiyat Hamdani
 * Date Created:         11/7/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
package lab07waiyat;
import java.util.Scanner;
public class Lab07Waiyat {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the length of an array");
       int length = input.nextInt();
       int array[] = new int[length];
       System.out.println("Enter "+length+" scores :");
       for(int i=0; i<length; i++){
           array[i] = input.nextInt();
       }
       printScores(array);
       int min = lowestScore(array);
   System.out.print("Low: "+min);
   System.out.println("");
       int max = highestScore(array);
   System.out.print("High: "+max);
   System.out.println("");
       double avg = averageScore(array);
   System.out.print("Avg: "+avg);
   System.out.println("");   
   char characters[] = {'A', 'B', 'C', 'D', 'F'};
   int count = 0;
   for(int i=0; i<characters.length; i++){
       count = 0;
       count = countGrades(array, characters[i]);
       System.out.println(characters[i]+"'s: "+count);
   }
   printDescendingScores(array);
   }
   // print scores
public static void printScores(int[] array){
   System.out.print("Printed Scores : ");
   for(int i=0; i<array.length; i++){
       System.out.print(array[i] +" ");
   }
   System.out.println("");
}
//lowest score
public static int lowestScore(int[] array){
   int min = array[0];
   for(int i=1; i<array.length; i++){
       if(min > array[i])
           min = array[i];
   }
return min;
}
//highest score
public static int highestScore(int[] array){
   int max = array[0];
   for(int i=1; i<array.length; i++){
       if(max < array[i])
           max = array[i];
   }
return max;   
}
//average score
public static double averageScore(int[] array){
   int sum = 0;
   for(int i=0; i<array.length; i++){
   sum = sum + array[i];
   }
   return ((double)sum/array.length);
}

//count grades
public static int countGrades(int[] array, char gradeType){
   int count = 0;
   for(int i=0; i<array.length; i++){
       if(array[i] <= 100 && array[i] >= 90 && gradeType == 'A')
           count++;
       else if(array[i] < 90 && array[i] >= 80 && gradeType == 'B')
           count++;
       else if(array[i] < 80 && array[i] >= 70 && gradeType == 'C')
           count++;
       else if(array[i] < 70 && array[i] >= 60 && gradeType == 'D')
           count++;
       else if(array[i] < 60 && gradeType == 'E')
           count++;
      
   }
   return count;
}
//print descending scores
public static void printDescendingScores(int[] array){
   int temp = 0;
for (int i = 0; i < array.length; i++)
{
for (int j = i + 1; j < array.length; j++)
{
if (array[i] < array[j])
{
temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
}
System.out.print("Scores in descending order: ");
for (int i = 0; i < array.length; i++)
{
System.out.print(array[i] + " ");
    }
   }
}

    

