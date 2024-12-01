/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.util.*;
import java.math.*;
public class J03015_HieuSoNguyenLon2 {

    public static BigInteger subscription(String a, String b){
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger result = A.add(B.negate());
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(subscription(a,b));
    }
}
//00000000000000001234567890
//000123456789012345678901234567890
