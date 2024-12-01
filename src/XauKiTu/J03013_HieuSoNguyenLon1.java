/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.math.*;
import java.util.*;
public class J03013_HieuSoNguyenLon1 {

    public static String substraction(BigInteger a, BigInteger b){ 
        BigInteger result = a.add(b.negate());
        result = result.abs();
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String Result = String.valueOf(result);
        int size = A.length() > B.length() ?  A.length() :  B.length();
        int cnt = size - Result.length();
        while(cnt-- > 0){
            Result = "0" + Result;
        }
        return Result;
    }
    public static String Add(BigInteger oldNum, int size){
        String newNum = "";
        newNum = String.valueOf(oldNum);
        while(size-- > 0){
            newNum = "0" + newNum;
        }
        return newNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger num1 = sc.nextBigInteger();
            BigInteger num2 = sc.nextBigInteger();
            System.out.println(substraction(num1,num2));
        }
    }
    
}
//2
//978
//12977
//100
//1000000