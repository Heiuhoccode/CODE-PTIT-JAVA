/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1;
import java.util.*;
import java.io.*;
/**
 *
 * @author admin
 */
public class TinhTongSoLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String temp = sc.next();
            try{
                int x = Integer.parseInt(temp);
            }
            catch(NumberFormatException thr1){
                try{
                    long y = Long.parseLong(temp);
                    sum += y;
                }
                catch(NumberFormatException thr2){
                }
            }
        }
        System.out.println(sum);
    }
}
