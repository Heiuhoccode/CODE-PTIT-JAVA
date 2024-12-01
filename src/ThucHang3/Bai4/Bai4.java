/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHang3.Bai4;

import java.io.*;
import java.util.*;
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner BT = new Scanner(new File("BAITAP.in"));
        ArrayList<BaiTap> dsbt = new ArrayList<>();
        while(BT.hasNext()){
            dsbt.add(new BaiTap(BT.nextLine(),BT.nextLine(),BT.nextLine()));
        }
        
        Scanner BC = new Scanner(new File("BAOCAO.in"));
        ArrayList<BaoCao> dsbc = new ArrayList<>();
        while(BC.hasNext()){
            dsbc.add(new BaoCao(BC.nextLine(),BC.nextLine()));
        }
        
        int sang = 0, chieu = 0;
        for(BaoCao x:dsbc){
            if(x.getStatus().equals("SANG")){
                sang++;
            }
            else{
                chieu++;
            }
        }
        
        System.out.println("DANH SACH SINH VIEN BAO CAO CA SANG: " + sang);
        for(BaoCao x:dsbc){
            if(x.getStatus().equals("SANG")){
                for(BaiTap y:dsbt){
                    if(y.getId().equals(x.getId())){
                        System.out.println(x.getId() + " " + y.getName() + " " + y.getTopic() + " " + x.getTime());
                    }
                }
            }
        }
//        System.out.println("");
        System.out.println("DANH SACH SINH VIEN BAO CAO CA CHIEU: " + chieu);
        for(BaoCao x:dsbc){
            if(x.getStatus().equals("CHIEU")){
                for(BaiTap y:dsbt){
                    if(y.getId().equals(x.getId())){
                        System.out.println(x.getId() + " " + y.getName() + " " + y.getTopic() + " " + x.getTime());
                    }
                }
            }
        }
    }
    
}
