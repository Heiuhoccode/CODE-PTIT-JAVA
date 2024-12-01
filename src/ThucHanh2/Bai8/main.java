/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2.Bai8;

import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        ArrayList<BigInteger> A = new ArrayList<>();
        sc.nextLine();
        while(n-- > 0){
            A.add(new BigInteger(sc.nextLine()));
        }
        BigInteger min = A.get(0);
        BigInteger max = A.get(0);
        BigInteger sum = new BigInteger("0");
        for(BigInteger x:A){
            if(x.compareTo(min) < 0){
                min = x;
            }
            if(x.compareTo(max) > 0){
                max = x;
            }
            sum = sum.add(x);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        
    }
    
}
