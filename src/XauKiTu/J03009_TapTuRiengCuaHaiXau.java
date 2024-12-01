/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.util.*;
public class J03009_TapTuRiengCuaHaiXau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        while(n-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String A[] = s1.split("\\s+");
            String B[] = s2.split("\\s+");
            for(int i=0; i<A.length; i++){
                for(int j=0; j<B.length; j++){
                    if(A[i].compareTo(B[j]) == 0){
                        A[i] = "DEL";
                    }
                }
            }
            TreeSet<String> C = new TreeSet<>();
            for(int i=0; i<A.length; i++){
                if(A[i].compareTo("DEL")==0) continue;
                C.add(A[i]);
            }
            for(String i:C){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }    
}
//2
//abc ab ab ab abcd
//ab abc
//aaa xyz ab zzz abc dd dd abc
//xyz dd ttt sas cdc