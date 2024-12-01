/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J05033_SapXepThoiGian;

import java.util.*;
import java.lang.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> ds = new ArrayList<>();
        for(int i=0 ;i<n; i++){
            int hour = sc.nextInt();
            int minutes = sc.nextInt();
            int second = sc.nextInt();
            Time temp = new Time(hour,minutes,second);
            ds.add(temp);
        }
        Collections.sort(ds);
        for(Time i:ds){
            System.out.println(i);
        }
    }
    
}
//3
//11 20 20
//14 20 14
//11 15 12