/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07007_LietKeTuKhacNhau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("VANBAN.in"));
        TreeSet<String> charr = new TreeSet<>();
        while(sc.hasNext()){
            String s[] = sc.nextLine().split("\\s+");
            for(String temp:s){
                charr.add(temp.toLowerCase());
            }
        }
        for(String temp:charr){
            System.out.println(temp);
        }
    }
    
}
