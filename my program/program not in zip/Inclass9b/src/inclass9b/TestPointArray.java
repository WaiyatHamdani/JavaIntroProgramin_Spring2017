/*****************************************************************************************
 * Program Name:             InClass09B 
 * Program Description:      Create a Point class with private data fields for X and Y ...............
 * Program Author:           Waiyat Hamdani
 * Date Created:             11/29/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************************/
package inclass9b;

/**
 *
 * @author waiya
 */
public class TestPointArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create an array of 5 points
        Point[] pointArray = new Point[5];
        populatePointArray(pointArray);
        printPointArray(pointArray);
        
        System.out.println("Total of all x values are: \t" + sumX(pointArray));
        System.out.println("Total of all y values are: \t" + sumY(pointArray));
        System.out.println("Total of all values are: \t" + Point.gettotalOfValues());
    }
    // popluate the array with random integers between 0-9 for both x and y values
    public static void populatePointArray(Point[] pointArray){
        for ( int i=0; i < pointArray.length; i++){
            pointArray[i] = new Point((int)(Math.random() * 10),(int)(Math.random()* 10));
        }
    }    
    // print the array
    public static void printPointArray(Point[] pointArray){
        System.out.println("X Values \tY values");
        for (Point pointArray1 : pointArray) {
            //System.out.println("i == " + i);
            System.out.println(pointArray1.getX() + "\t\t" + pointArray1.getY());
        }
    }
    // sum of x values
    public static int sumX(Point[] pointArray){
        int sum = 0;
        for (Point pointArray1 : pointArray) {
            sum += pointArray1.getX();
        }
        
        return sum;
    } 
    // sum of y values
    public static int sumY(Point[] pointArray){
        int sum = 0;
        for (Point pointArray1 : pointArray) {
            sum += pointArray1.getY();
        }
        
        return sum;
    }
    
}
