package LapTrinhJavaCoBan;
import java.util.*;

public class J01022_XauNhiPhan {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[105];
    public static void setup_Fibo(){
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i=3; i<100; i++){
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
    }
    public static long analysis(int N, long K){
        if(N==1){
            return 0;
        }
        if(N==2){
            return 1;
        }
        if(fibo[N-2] >= K){
            return analysis(N-2,K);
        }
        else{
            return analysis(N-1, K - fibo[N-2]);
        }    
    }
    public static void main(String[] args) {
        setup_Fibo();
        int test = sc.nextInt();
        while(test-- > 0){
            int N = sc.nextInt();
            long K = sc.nextLong();
            System.out.println(analysis(N,K));
        }
    }
}