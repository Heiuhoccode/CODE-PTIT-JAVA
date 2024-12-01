/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04006_KhaiBaoLopSinhVien;

import java.util.*;
import java.text.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        String Clas = sc.nextLine();
        String DateOB = sc.nextLine();
        float GPA = sc.nextFloat();
//        String[] date = DateOB.split("/");
//        for(String i:date){
//            System.out.println(i);
//        }
        SinhVien A = new SinhVien(Name, Clas, DateOB, GPA);
        System.out.println(A);
    }
}
//Nguyen Hoa Binh
//D20CQCN04-B
//22/2/2002
//2