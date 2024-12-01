/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.*;
/**
 *
 * @author admin
 */
public class J02023_LuaChonThamLam {
    public static Scanner sc = new Scanner(System.in);
    public static String Minn="", Maxx="";
    
    public static void Min(int n, int s){
        while(s > 9){
            Minn = "9" + Minn;
            s-=9;
            n--;
        }
        if(n>1){
            s-=1;
            n-=1;
            Minn = s + Minn;
            while(n-- > 1){
                Minn = "0" + Minn;
            }
            Minn = "1" + Minn;    
        }
        else{
            Minn = s + Minn;
        }
    }
    public static void Max(int n, int s){
//        if(s==0){
//            if(n==1){
//                Maxx = "0";
//            }
//            else{
//                Maxx = "-1";
//            }
//            return;
//        }
        while(n-- > 0){
            if(s >= 9){
                s-=9;
                Maxx =  Maxx + "9";
            }
            else if(s!=0){
                Maxx = Maxx + s;
                s=0;
            }
            else{
                Maxx = Maxx + "0";
            }
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(9*n < s || n<=0 || s<0 ||(n>1&&s==0)){
            System.out.println("-1 -1");
        }
        else{
            Min(n,s);
            Max(n,s);
            System.out.println(Minn + " " + Maxx);
        }
    }
}
