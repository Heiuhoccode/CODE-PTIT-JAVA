/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04010_DienTichHinhTronNgoaiTiepTamGiac;

import static java.lang.Math.sqrt;
import java.util.*;
public class J04010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());
            double AB = A.distance(B);
            double BC = B.distance(C);
            double AC = A.distance(C);
            if(AB + BC <= AC || AB + AC <= BC || BC + AC <= AB){
                System.out.println("INVALID");
            }
            else{
                double dienTich = sqrt((AB + BC + AC)*(AB + BC - AC)*(AB - BC + AC)*(- AB + BC + AC)) * 1/4;
                double banKinh = (AB * BC * AC) / (4*dienTich);
                double dienTichHTNT = Math.PI * Math.pow(banKinh, 2);
                System.out.printf("%.3f\n", dienTichHTNT);
            }
        }
    }
    
}