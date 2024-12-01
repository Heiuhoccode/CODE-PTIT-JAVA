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
public class J01013_TongUocSo1 {
    public static Scanner sc = new Scanner(System.in);
    public static final int N = (int)(2*Math.pow(10,6));
    public static int[] nguyenTo = new int[N+5];
    public static void sangNguyento(){
        for(int i=0; i<=N; i++){
            nguyenTo[i] = 1;
        }
        nguyenTo[0] = nguyenTo[1] = 0;
        for(int i=2; i<=Math.sqrt(N); i++){
            if(nguyenTo[i] == 1){
                for(int j=i*2; j<= N; j+=i){
                    if(nguyenTo[j]==1){
                        nguyenTo[j] = i;    
                    }
                    
                }
            }
        }
        for(int i=0; i<= N; i++){
            if(nguyenTo[i]==1){
                nguyenTo[i]=i;
            }
        }
        // kết quả mảng nguyenTo cho ra những số nguyên tố là ước của index tương ứng
    }
    public static int analysis(int num){
        int sum = 0;
        if(nguyenTo[num] == 1){
            return num;
        }
        while(num!=1){
            sum += nguyenTo[num];
            num /= nguyenTo[num];
        }
        return sum;
    }
    public static void main(String[] args) {
        int cnt = sc.nextInt();
        long sum = 0;
        sangNguyento();
        while(cnt-- > 0){
            int number = sc.nextInt();
            sum += analysis(number);
        }
        System.out.println(sum);
    }
}
