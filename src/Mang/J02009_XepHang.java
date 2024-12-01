package Mang;
import java.util.*;
public class J02009_XepHang {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long a[][] = new long[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int min;
        for(int i=0; i<n-1; i++){
            min=i;
            for(int j=i+1; j<n; j++){
                if(a[j][0] < a[min][0]){
                    min=j;
                    long temp = a[min][0];
                    a[min][0] = a[i][0];
                    a[i][0]= temp;
                    long temp1 = a[min][1];
                    a[min][1] = a[i][1];
                    a[i][1]= temp1;
                }
            }
        }
        for(int i=0; i<n-1; i++){
            if(a[i][0] + a[i][1] > a[i+1][0]){
                a[i+1][0] = a[i][0] + a[i][1];
            }
        }
        System.out.println(a[n-1][0] + a[n-1][1]);
    }
}
