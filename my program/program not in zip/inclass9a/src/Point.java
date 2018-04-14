/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waiya
 */
class Point {
    private static int numberOfPoints;
    private static int numberOfRectangles;
    
    private final int xPoint;
    private final int yPoint;

   
    Point (int newX1, int newY1){
    
     xPoint = newX1;
     yPoint = newY1;
     numberOfPoints++;
     numberOfRectangles = numberOfPoints / 2;
    
    }
    
    public static int getRectangles(){
     return numberOfRectangles;
    }
    
    public static int getPoints(){
     return numberOfPoints;
    }
    
    public static int getX(Point p1){
        return p1.xPoint;
    }
    public static int getY(Point p1){
        return p1.yPoint;
    }
    public static int getLength (Point p1, Point p2){
        return Math.abs(p1.yPoint-p2.yPoint);
    }
    
     public static int getWidth (Point p1, Point p2){
        return Math.abs(p1.xPoint-p2.xPoint);
     }
   
     public static int getPerimeter(Point p1, Point p2){
        return 2*(getLength(p1,p2)+getWidth(p1, p2));
     }
   
     public static int getArea (Point p1, Point p2){
        return (getLength(p1,p2) * getWidth(p1, p2));
    }
 
     public static double getDiagonal(Point p1, Point p2 ){
         
         return Math.sqrt((double)getLength(p1, p2)* (double)getLength(p1, p2) + (double)getWidth(p1, p2)* (double)getWidth(p1, p2));
     }
}

