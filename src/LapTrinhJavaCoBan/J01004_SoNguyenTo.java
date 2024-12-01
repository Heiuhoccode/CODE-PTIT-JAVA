/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import  java.util.*;
/**
 *
 * @author admin
 */
public class J01004_SoNguyenTo {
    public static int snt(long num){
        if(num<2){
            return 0;
        }
        for(long i=2; i<Math.sqrt(num);i++){
            if(num%i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while(test > 0){
            long number = scanner.nextInt();
            if(snt(number) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
