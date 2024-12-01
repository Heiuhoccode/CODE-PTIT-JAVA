/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP;

import java.util.*;
public class DaoTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            ArrayList<String> S = new ArrayList <> (Arrays.asList(sc.nextLine().trim().split("\\s+")));
            Collections.reverse(S);
            for(String i:S){
                System.out.print(i +" ");
            }
            System.out.println("");
        }
    }
}
//2
//I like this program very much
//much very program this like I