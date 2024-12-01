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
public class J01012_UocSoChiaHetCho2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            int number = sc.nextInt();
            int cnt = 0;
            for(int i=1; i<=Math.sqrt(number); i++){
                if(number%i==0){
                    if(i%2==0 && (number/i)%2==0 && i!=(number/i)){
                        cnt+=2;
                    }
                    else if(i%2==0 && i==(number/i)){
                        cnt++;
                    }
                    else if(i%2!=0 && (number/i)%2==0&& i!=(number/i)){
                        cnt++;
                    }
                    else if(i%2==0 && (number/i)%2!=0&& i!=(number/i)){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
