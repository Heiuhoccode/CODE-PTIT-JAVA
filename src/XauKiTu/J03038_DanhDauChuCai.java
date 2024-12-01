/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
public class J03038_DanhDauChuCai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Map<String,Integer> map = new HashMap<>();
        int cnt=0;
        int cnt1=0;
        for(int i=0; i<a.length(); i++){
            if(map.get(String.valueOf(a.charAt(i)))== null){
                map.put(String.valueOf(a.charAt(i)), 1);
                cnt1++;
            }
        }
        System.out.println(cnt1);
    }
}
