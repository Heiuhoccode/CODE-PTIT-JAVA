/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2;
import java.util.*;
import java.math.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeA = sc.nextInt();
        int sizeB = sc.nextInt();
        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();
        for(int i=0; i<sizeA; i++){
            A.add(sc.nextInt());
        }
        for(int i=0; i<sizeB; i++){
            B.add(sc.nextInt());
        }
        Set<Integer> giao = new TreeSet<>();
        giao.addAll(A);
        giao.retainAll(B);
        for(Integer x:giao){
            System.out.print(x + " ");
        }
        System.out.println("");
        A.removeAll(giao);
        for(Integer x:A){
            System.out.print(x+" ");
        }
        System.out.println("");
        B.removeAll(giao);
        for(Integer x:B){
            System.out.print(x + " ");
        }
    }
}
