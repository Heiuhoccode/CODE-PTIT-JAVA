/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.*;
/**
 *
 * @author admin
 */
public class J02014_DiemCanBang {
    public static Scanner sc = new Scanner(System.in);
//    public static int process(int N[],int size, int top, int bot, int sumL, int sumR){
//        if(bot - top == 1 && sumL==sumR){
//            return top+1;
//        }
//        if(sumL < sumR && top<size-2){
//            top++;
//            sumL += N[top];
//            return process(N,size,top,bot,sumL,sumR);
//        }
//        if(sumL > sumR && bot>1){
//            bot--;
//            sumR += N[bot];
//            return process(N,size,top,bot,sumL,sumR);
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int test = sc.nextInt();
//        while(test-- > 0){
//            int size = sc.nextInt();
//            int N[] = new int[size];
//            for(int i=0; i<size; i++){
//                N[i] = sc.nextInt();
//            }
//            int sumL = N[0];
//            int sumR = N[size-1];
//            int position = process(N,size,0,size-1,sumL,sumR);
//            System.out.println(position);
//        }
//    }
    public static int tong(int N[], int size){
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += N[i];
        }
        return sum;
    }
    public static int process(int N[], int size){
        int sum = tong(N,size);
        int small_sum = 0;
        for(int i=0; i<size; i++){
            
            if((sum-N[i]) == small_sum*2){
                return i+1;
            }
            small_sum += N[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            int size = sc.nextInt();
            int N[] = new int[size];
            for(int i=0; i<size; i++){
                N[i] = sc.nextInt();
            }
            int position = process(N,size);
            System.out.println(position);
        }
    }
}
