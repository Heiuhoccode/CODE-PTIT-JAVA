/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author admin
 */
public class J03033_BoiSoChungNhoNhat {
    public static Scanner sc = new Scanner(System.in);
    public static BigInteger process(BigInteger a, BigInteger b){
        BigInteger compare = new BigInteger("0");
        if(b.compareTo(compare) == 0){
            return a;
        }
        return process(b, a.mod(b));
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            String numberA = sc.next();
            String numberB = sc.next();
            BigInteger bigNumberA = new BigInteger(numberA);
            BigInteger bigNumberB = new BigInteger(numberB);
            System.out.println((bigNumberA.multiply(bigNumberB)).divide(process(bigNumberA, bigNumberB)));
        }
    }
}
