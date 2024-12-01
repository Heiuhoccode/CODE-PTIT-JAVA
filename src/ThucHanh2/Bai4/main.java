/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2.Bai4;

import java.io.*;
import java.util.*;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> A = new ArrayList<>();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(sc.nextInt() == 1 && j>i){
                    A.add(new Pair(i,j));
                }
            }
        }
        Collections.sort(A);
        for(Pair x:A){
            System.out.println(x);
        }
    }
    
}
