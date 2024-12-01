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
public class J02106_MaTranNhiPhan {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int cnt1=0;
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<3; j++){
                int x = sc.nextInt();
                if(x==1){
                    cnt++;
                }
            }
            if(cnt>1){
                cnt1++;
            }
        }
        System.out.println(cnt1);
    }
}
