
package KhaiBaoLopVaDoiTuong.J04009_DienTichTamGiac;

import static java.lang.Math.sqrt;
import java.util.*;
public class J04009 {

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
                System.out.printf("%.2f\n",dienTich);
            }
        }
    }
    
}
