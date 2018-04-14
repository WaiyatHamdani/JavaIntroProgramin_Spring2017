/******************************************************************************
 * Program Name:          Lab9a - 
 * Program Description: two separate classes test point and point
 * Program Author:        Waiyat Hamdani
 * Date Created:          12/11/2016
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author waiya
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("Enter x1 y1 x2 y2: ");
    StringTokenizer st = new StringTokenizer (input, " ");
    int x1 = Integer.parseInt(st.nextToken());
    int y1 = Integer.parseInt(st.nextToken());
    int x2 = Integer.parseInt(st.nextToken());
    int y2 = Integer.parseInt(st.nextToken());
    
    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);
    
    String output = "The distance between the two points (" + p1.toString() + ")" + 
                       " and " + "(" + p2.toString()+ ")" +" is "+ Point.getDistance(p1, p2);
    
   JOptionPane.showMessageDialog(null, output);

    }
    
}
