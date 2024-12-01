/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import static java.lang.Math.abs;
import java.util.*;

/**
 *
 * @author admin
 */
public class J01025_HinhVuong {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x1_H1 = sc.nextInt();
        int y1_H1 = sc.nextInt();
        int x2_H1 = sc.nextInt();
        int y2_H1 = sc.nextInt();
        int x1_H2 = sc.nextInt();
        int y1_H2 = sc.nextInt();
        int x2_H2 = sc.nextInt();
        int y2_H2 = sc.nextInt();
        int x; int y;
        x = Math.max(abs(x1_H1-x2_H1),Math.max(abs(x1_H2-x2_H2), Math.max(abs(x1_H1-x2_H2),abs(x1_H2-x2_H1))));
        y = Math.max(abs(y1_H1-y2_H1),Math.max(abs(y1_H2-y2_H2), Math.max(abs(y1_H1-y2_H2),abs(y1_H2-y2_H1))));
        int cah = Math.max(x,y);
        System.out.println(cah*cah);
    }
}
