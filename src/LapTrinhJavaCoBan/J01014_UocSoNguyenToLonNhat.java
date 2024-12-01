/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import java.util.*;
/**
 *
 * @author admin
 */
public class J01014_UocSoNguyenToLonNhat {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            long N = sc.nextLong();
            long result = 0;
            for(long i = 2; i<= Math.sqrt(N); i++){
                while(N%i==0){
                    result = i;
                    N/=i;
                }
            }
            if(N>1){
                result = N;
            }
            System.out.println(result);
        }
    }
}
