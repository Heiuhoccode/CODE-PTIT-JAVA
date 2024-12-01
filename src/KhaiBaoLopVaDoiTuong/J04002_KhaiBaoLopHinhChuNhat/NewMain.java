/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04002_KhaiBaoLopHinhChuNhat;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.nextLine().trim().toLowerCase();
        if(width <= 0 || height <= 0){
            System.out.println("INVALID");
        }
        else{
            String newColor = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
    //        System.out.println(newColor);
            Rectange A = new Rectange(width, height, newColor);
            System.out.println(A);    
        }
        
    }
    
}
