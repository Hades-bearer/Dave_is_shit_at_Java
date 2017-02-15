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

    /**
     * @param args the command line arguments
     */
    
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private Graphics g;
    
    public JavaApplication4(){
        gui();
    }
    
    public void gui(){
        frame = new JFrame("Frame");
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this enables you to close the JFrame
        
        panel = new JPanel();
        //panel.setBackground(Color.BLACK);
        
        frame.add(panel);
        
        g = panel.getGraphics();

   

        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaApplication4();

    }
    
    protected void paintComponent(Graphics g) {

        g.setColor(Color.red);
        g.fillOval(0, 0, 100, 100);
        
    }
    
}

