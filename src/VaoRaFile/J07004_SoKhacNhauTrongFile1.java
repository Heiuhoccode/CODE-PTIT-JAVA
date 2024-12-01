/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07004_SoKhacNhauTrongFile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer,Integer> quantity = new HashMap<>();
        TreeSet<Integer> Number = new TreeSet<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s[]= sc.nextLine().split("\\s+");
            for(String temp:s){
                int number = Integer.parseInt(temp);
                Number.add(number);
                int cnt =1;
                if(quantity.get(number)!=null){
                    cnt = quantity.get(number);
                    cnt++;
                }
                quantity.put(number, cnt);
            }
        }
        for(Integer number:Number){
            System.out.println(number + " " + quantity.get(number));
        }
        
    }
    
}
