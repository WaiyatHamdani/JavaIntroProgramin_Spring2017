/******************************************************************************
 * Program Name:          Lab9a - 
 * Program Description: two separate classes test point and point
 * Program Author:        Waiyat Hamdani
 * Date Created:          12/11/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/

/**
 *
 * @author waiya
 */
public class Point {
    private int x;
    private int y;
 
    
    public Point (){
        this (0,0);
}
    
    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public static double getDistance (Point p1, Point p2 ){
        return Math.sqrt( Math.pow((p1.x - p2.x),2)  + Math.pow ((p1.y - p2.y),2));
    }
         
}

