package arrayexercises;
public class ArrayExercises {
  public static void main(String[] args) {
    int[] array = new int[5];
    
    //assigning values
    for (int i = 0; i < 5; i++) {
      // array[i] = i + array[i-1];
      array[i] = i*i;  
    }
    array[4] = array[1] + array[2];
    
    //print array
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    
    //print array another way
    System.out.println();
    for (int elementValue: array) 
      System.out.print(elementValue + " ");
    
    //print total
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    System.out.println("\nTotal: " + total);
    double avg = (double) total / array.length;
    System.out.println("Avg: " + avg);
    
    //print max
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) max = array[i];
    }
    System.out.println("Max: " + max);
    
    //copy array
    int[] sourceArray = {2, 3, 1, 5, 10};
    int[] targetArray = new int[sourceArray.length];
    for (int i = 0; i < sourceArray.length; i++)
      targetArray[i] = sourceArray[i];
    System.out.print("Source array: ");
    for (int elementValue: sourceArray) 
      System.out.print(elementValue + " ");
    System.out.print("\nTarget array: ");
    for (int elementValue: targetArray) 
      System.out.print(elementValue + " ");
    
    //copy array another way
    int[] sourceArray2 = {2, 4, 6, 8, 10};
    int[] targetArray2 = new int[sourceArray2.length];
    System.arraycopy(sourceArray2, 0, targetArray2, 3, sourceArray.length-3);
     System.out.print("\nSource array2: ");
    for (int elementValue: sourceArray2) 
      System.out.print(elementValue + " ");
    System.out.print("\nTarget array2: ");
    for (int elementValue: targetArray2) 
      System.out.print(elementValue + " ");
  }
}
