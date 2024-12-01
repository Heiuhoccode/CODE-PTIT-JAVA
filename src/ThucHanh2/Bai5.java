/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2;

import java.io.*;
import java.util.*;
public class Bai5 {
    public static void main(String[] args)throws IOException,
            ClassNotFoundException,
            FileNotFoundException  {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> A = (ArrayList<String>) in1.readObject();
        TreeSet<String> B = new TreeSet<>();
        TreeSet<Integer> C = new TreeSet<>();
        for(String x:A){
            String temp[] = x.split("\\s+");
            for(String y:temp){
                if(y.matches("\\d+")){
                    C.add(Integer.valueOf(y));
                }    
            }
        }
        for(Integer x:C){
            System.out.println(x);
        }
    }
}