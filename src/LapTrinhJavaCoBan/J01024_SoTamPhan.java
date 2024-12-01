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
public class J01024_SoTamPhan {
    public static Scanner sc = new Scanner(System.in);
    public static int check(String number){
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) != '0' && number.charAt(i) != '1' &&number.charAt(i) != '2'){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
//        sc.nextLine();
        while(test-- > 0){
            String number = sc.next();
            if(check(number) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
