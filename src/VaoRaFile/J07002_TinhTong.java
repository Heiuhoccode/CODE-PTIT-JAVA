/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07002_TinhTong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String temp[] = sc.nextLine().split("\\s+");
            for(String x:temp){
                try{
                    int number = Integer.parseInt(x);
                    sum += number;
                }
                catch (NumberFormatException e){
                    
                }
            }
        }
        System.out.println(sum);
    }
    
}
