/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1.ThucTapCoSo;

import java.io.*;
import java.util.*;


public class TTCS {

    
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Student> DSHS = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            DSHS.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        sc.close();
        
        ArrayList<Subject> DSDT = new ArrayList<>();
        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            DSDT.add(new Subject(sc.nextLine(),sc.nextLine()));
        }
        sc.close();
        
        ArrayList<Assignment> DSNV  = new ArrayList<>();
        sc = new Scanner(new File("NHIEMVU.in"));
        n = Integer.parseInt(sc.nextLine());
        while(n-- >0){
            String msv = sc.next();
            String subID = sc.next();
            Assignment temp = new Assignment(msv, subID);
            for(Student HS:DSHS){
                if(HS.id.equals(msv)){
                    temp.stu = HS;
                }
            }
            for(Subject DeTai: DSDT){
                if(DeTai.id.equals(subID)){
                    temp.sub = DeTai;
                }
            }
            DSNV.add(temp);
        }
        sc.close();
        Collections.sort(DSNV);
        for(Assignment i:DSNV){
            System.out.println(i);
        }
    }
    
}
