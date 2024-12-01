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
public class J01026_SoChinhPhuong {
//    public Scanner sc1 = new Scanner(System.in);
//    public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int test = sc1.nextInt();
        while(test-- > 0){
            solve();
        }
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = (int)Math.sqrt(n);
        if(temp*temp == n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
