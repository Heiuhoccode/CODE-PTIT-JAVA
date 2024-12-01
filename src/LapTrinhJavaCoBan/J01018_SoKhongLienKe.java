/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import java.util.*;
import static java.lang.Math.abs;

/**
 *
 * @author admin
 */
public class J01018_SoKhongLienKe {
    
    public static int check(String number){
        int sum = 0;
        for(int i=0; i<number.length(); i++){
            sum += (number.charAt(i) - 48);
        }
        for(int i=0; i<number.length()-1; i++){
            if(abs(number.charAt(i) - number.charAt(i+1)) != 2){
                return 0;
            }
        }
        if(sum%10==0){
            return 1;
        }
        return 0;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String number = sc.nextLine();
            if(check(number) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
