/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP;

import java.util.*;
public class TangDan_GiamDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            TreeSet<Integer> Chan = new TreeSet<>();
            TreeSet<Integer> Le = new TreeSet<>(Comparator.reverseOrder());
            for(int i=0; i<n; i++){
                int  temp = sc.nextInt();
                if(temp%2==0){
                    Chan.add(temp);
                }
                else{
                    Le.add(temp);
                }
            }
            for(int i:Chan){
                System.out.print(i + " ");
            }
            System.out.println("");
            for(int i:Le){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    
}
