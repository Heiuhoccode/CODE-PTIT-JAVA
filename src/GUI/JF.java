/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.awt.*;
import java.util.*;
import java.math.*;
import javax.swing.*;
public class JF{ 
    public static void main(String[] args) {
        JFrame test1 = new JFrame("test1");
        test1.setSize(400,300);
        test1.setVisible(true);
        test1.getContentPane().add(new JLabel("First Name: "));
        test1.getContentPane().add(new JTextField(""));
        
        test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
