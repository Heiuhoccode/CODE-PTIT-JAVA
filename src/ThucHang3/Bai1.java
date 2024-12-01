/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHang3;

import java.util.*;
import java.io.*;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String num = sc.nextLine();
            String[] partNum = num.split("\\s+");
            for(String x:partNum){
                try{
                    long number = Long.parseLong(x);
                    if(number > Integer.MAX_VALUE){
                        sum+=number;
                    }
                }
                catch(NumberFormatException ex){
                    
                }
            }
        }
        System.out.println(sum);
    }
    
}
