/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1;
import java.util.*;
import java.io.*;
/**
 *
 * @author admin
 */
public class ThietLapDiaChiEmail2 {
    private static String LocMail(String[] Tu){
        String Mail = Tu[Tu.length -1];
        for(int i=0; i<Tu.length -1; i++){
            Mail += Tu[i].charAt(0);
        }
        return Mail;
    } 
    private static String LocHoTen(String[] Tu){
        String HoTen = "";
        for(String temp:Tu){
            HoTen += temp +" ";
        }
        return HoTen;
    } 
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> mapMail = new HashMap<>();
        Map<String, Integer> mapTen = new HashMap<>();
        while(sc.hasNext()){
            String[] Tu = sc.nextLine().trim().toLowerCase().split("\\s+");
            String HoTen = LocHoTen(Tu);
            String Mail = LocMail(Tu);
//            System.out.println(Ten);
//            System.out.println(Mail);
            if(!mapTen.containsKey(HoTen)){
                mapTen.put(HoTen, 1);
                int cnt = (mapMail.containsKey(Mail) ? mapMail.get(Mail) : 0) +1;
                mapMail.put(Mail,cnt);
                System.out.println(Mail + (cnt>1 ? cnt : "") + "@ptit.edu.vn");
            }
        }
    }
}
