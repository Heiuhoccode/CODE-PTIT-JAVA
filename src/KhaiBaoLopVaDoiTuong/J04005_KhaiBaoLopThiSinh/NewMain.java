/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04005_KhaiBaoLopThiSinh;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String Nsinh = sc.nextLine();
        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();
        ThiSinh A = new ThiSinh(name,Nsinh,mark1,mark2,mark3);
        System.out.println(A);
    }
    
}
//Nguyen Hoang Ha
//11/10/2001
//4.5
//10.0
//5.5