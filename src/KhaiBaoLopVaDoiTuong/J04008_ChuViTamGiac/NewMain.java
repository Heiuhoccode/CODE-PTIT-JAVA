/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04008_ChuViTamGiac;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
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
                System.out.printf("%.3f\n",AB + BC + AC);
            }
        }
    }
    
}
//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0