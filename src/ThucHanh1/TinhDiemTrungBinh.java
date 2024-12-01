/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1;
import java.util.*;
/**
 *
 * @author admin
 */
public class TinhDiemTrungBinh {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float min = 11;
        float max = -1;
        float sum = 0;
        int n = sc.nextInt();
        float a[] = new float[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextFloat();
            if(min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }
        int cnt =0;
        for(int i=0; i<n; i++){
            if(a[i]!=min && a[i]!=max){
                cnt++;
                sum += a[i];
            }
        }
        float result = sum/cnt;
        System.out.printf("%.2f", result);
    }
}
