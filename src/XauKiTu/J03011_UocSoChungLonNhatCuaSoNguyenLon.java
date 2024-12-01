/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
import java.math.*;
public class J03011_UocSoChungLonNhatCuaSoNguyenLon {

    /**
     * @param args the command line arguments
     */
    public static BigInteger UCLN(BigInteger a, BigInteger b){
        BigInteger compare = new BigInteger("0");
        if(b.compareTo(compare) == 0){
            return a;
        }
        return UCLN(b, a.mod(b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(UCLN(a,b));
        }
    }
    
}
