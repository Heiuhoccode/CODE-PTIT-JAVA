/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.*;
import java.math.*;
public class Console1 {
    
    public JFrame Console(){
        JFrame console1 = new JFrame();
        console1.setTitle("test");
        console1.setSize(400,300);
        JPanel colorPanel = new JPanel();
        console1.add(colorPanel);
        colorPanel.setBackground(Color.red);
        console1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        console1.add(new JButton());
        return console1;
    }
    
}
