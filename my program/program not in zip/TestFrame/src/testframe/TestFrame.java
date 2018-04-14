/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testframe;

import javax.swing.JFrame;
public class TestFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame1 = new JFrame();
    frame1.setTitle("Window 1");
    frame1.setSize(300, 250);
    frame1.setLocation(200, 650);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setVisible(true);

    JFrame frame2 = new JFrame();
    frame2.setTitle("Window 2");
    frame2.setSize(300, 250);
    frame2.setLocation(410, 650);
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setVisible(true);
    }
    
}
