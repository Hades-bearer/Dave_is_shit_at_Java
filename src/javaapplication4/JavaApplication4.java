package javaapplication4;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;



/**
 *
 * @author Dave.Hayden
 */
public class JavaApplication4 {

    private JFrame frame;
    private CirclePanel panel;
    private JButton button;
    private JLabel label;
    private Graphics g;
    
    public JavaApplication4(){
        gui();
    }
    
    private void gui(){
        frame = new JFrame("Frame");
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //this enables you to close the JFrame
        
        panel = new CirclePanel();
        //panel.setBackground(Color.BLACK);

        frame.add(panel);

    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaApplication4();

    }

    class CirclePanel extends JPanel {
        public CirclePanel(){
            super();
        }
        protected void paintComponent(Graphics g) {

            g.setColor(Color.red);
            g.fillOval(0, 0, 100, 100);

        }
    }
    
}

