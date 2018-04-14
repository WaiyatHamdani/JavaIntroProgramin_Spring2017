/********************************************************************************
 * Program Name:          Inclass07
 * Program Description:  average 0-100
 *
 * Program Author:        Waiyat Hamdani
 * Date Created:          11/2/2015
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    -------------------
********************************************************************************/
package inclass07;

import java.util.Scanner;

public class Inclass07 {

public static void main(String[] args) {
 Scanner input = new Scanner(System.in);        

int number = 0;
int count = 0;
int sum = 0;
double mean;
    mean = 0.0;
int BelowAverage = 0;
int AboveAverage = 0;
int[] array = new int[100];
System.out.print("Enter a number between 1 to 100: ");
number = input.nextInt();

while(number >=0){
sum += number;
array[number]++;
count ++;
System.out.print("Enter a number between 1 to 100: ");
number = input.nextInt();
}

mean = sum/count;

for(int i =0; i < mean; i++){
BelowAverage += array[i];
}
for (int i = 100; i >= mean; i--){
AboveAverage += array[i];
}

System.out.println("number of score above or equal to average : "+AboveAverage);
System.out.println("number of score below average : "+BelowAverage);

}
}
