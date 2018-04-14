/*****************************************************************************************
 * Program Name:             InClass09A  
 * Program Description:      Create a rectangle if you have two points.......
 * Program Author:           Waiyat hamdani
 * Date Created:             11/20/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************************/

import javax.swing.JOptionPane;
public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point [] arPoints = new Point[4];
        int i;
     
        for(i = 0; i<2; i++ ){
        int x1 = Integer.parseInt(JOptionPane.showInputDialog("Enter x:"+ (i+1)));
        int y1 = Integer.parseInt(JOptionPane.showInputDialog("Enter y:"+ (i+1)));

        arPoints[i] = new Point(x1,y1); 
        
        }
         
        
        for(int j = 0; j<4;j+=2){
            
        String output;
        output = "Point is ("+ Point.getX(arPoints[j]) + ","+ Point.getY(arPoints[j]) + ")\n";
        output +="Point is ("+ Point.getX(arPoints[j+1])+","+Point.getY(arPoints[j+1]) + ")\n\n";
        output +="Diagonal length: "+ Point.getDiagonal(arPoints[j], arPoints[j+1]) +"\n";
        output +="Perimeter is : "+ Point.getPerimeter(arPoints[j], arPoints[j+1])+ "\n";
        output +="Area is : "+ Point.getArea(arPoints[j], arPoints[j+1])+ "\n";
        output +="Number of points is : "+ Point.getPoints() + "\n";
        output +="Number of rectangles is : "+ Point.getRectangles() + "\n";
       
        
        JOptionPane.showMessageDialog(null, output);
               
        for(; i<4; i++ ){
        arPoints[i] = new Point(2*Point.getX(arPoints[i-2]), 2*Point.getY(arPoints[i-2]));

        }
        
        
        }
    }
    
}
