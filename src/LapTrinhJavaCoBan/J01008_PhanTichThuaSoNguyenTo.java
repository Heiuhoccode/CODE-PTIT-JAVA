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
public class J01008_PhanTichThuaSoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    public static void analysis(long num){
        if(num == 1){
            System.out.print("1(1)");
        }
        long temp = 2;
        int cnt = 0;
        do{
            if(num % temp == 0){
                num /= temp;
                cnt++;
            }
            else if(num % temp != 0){
                temp++;
                cnt=0;
            }
            if(num % temp != 0 && cnt > 0){
                System.out.print(temp + "(" + cnt + ") ");

            }
        }while(num > 1);
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        for(int te=1; te<=test; te++){
            long number = sc.nextLong();
            System.out.print("Test " + te + ": ");
            analysis(number);
            System.out.println("");
        }
    }
}
