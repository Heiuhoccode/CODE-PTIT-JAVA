/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
import java.math.*;
public class J03040_BienSoDep {

    public static String check(String a){
        boolean check_tangchat = true;
        boolean check_5bang = true;
        boolean check_23bang = true;
        boolean check_68 = true;
        for(int i=1; i<a.length(); i++){
            if(a.charAt(i-1) >= a.charAt(i)){
                check_tangchat = false;
                break;
            }
        }
        for(int i=1; i<a.length(); i++){
            if(a.charAt(0)!=a.charAt(i)){
                check_5bang = false;
                break;
            }
        }
        if(a.charAt(0)!=a.charAt(1) || a.charAt(0)!=a.charAt(2) || a.charAt(3)!=a.charAt(4)){
            check_23bang = false;
        }
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!='6' && a.charAt(i)!='8'){
                check_68 = false;
                break;
            }
        }
        if(check_tangchat || check_5bang || check_23bang || check_68){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-- > 0){
            String numberSign = sc.nextLine();
            String a = "";
            for(int i=5; i<numberSign.length(); i++){
                if(i==8) continue;
                a += numberSign.charAt(i);
            }
            System.out.println(check(a));
        }
    }
    
}
//7
//29T1–123.45
//29T1–555.55
//29T1–222.33
//29T1–686.88
//29T1–123.33
//29T1–555.54
//29T1–606.88