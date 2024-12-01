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
public class J01010_CatDoi {
    public static Scanner sc = new Scanner(System.in);
    public static int checkPosible(String number){
        for(int i=0; i<number.length(); i++){
            char temp = number.charAt(i);
            if(temp != '0' && temp != '1' && temp != '8' && temp != '9'){
                return 0;
            }
        }
        return 1;
    }
    public static int checkFull0(String number){
        for(int i=0; i<number.length(); i++){
            char temp = number.charAt(i);
            if(temp == '1'){
                return 1;
            }
        }
        return 0;
    }
    public static void change(String number){
        int ok=0;
        for(int i=0; i<number.length(); i++){
            char temp = number.charAt(i);
            if(temp == '1'){
                ok=1;
            }
            if(ok==1){
                if(temp == '0' || temp == '8' || temp == '9'){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }    
            }
        }
        
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        sc.nextLine();
        while(test > 0){
            String number = sc.nextLine();
            if(checkPosible(number) == 1 && checkFull0(number) == 1){
                change(number);
                System.out.println("");
            }
            else{
                System.out.println("INVALID");
            }
            test--;
        }
    }
}
