/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05032_TreNhatGiaNhat;

import java.util.*;
public class J05032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<People> dspp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            dspp.add(new People(sc.next(),sc.nextLine().trim()));
            
        }
        Collections.sort(dspp);
        System.out.println(dspp.get(0));
        System.out.println(dspp.get(dspp.size()-1));
    }
    
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990