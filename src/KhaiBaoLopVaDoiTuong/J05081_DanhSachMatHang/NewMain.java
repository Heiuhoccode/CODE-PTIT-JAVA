/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J05081_DanhSachMatHang;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<HangHoa> ds = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            String ID = String.valueOf(i);
            int size = 3 - ID.length();
            while(size-- > 0){
                ID = "0" + ID;
            }
            sc.nextLine();
            String Name = sc.nextLine();
            String Unit = sc.nextLine();
            int Buy = sc.nextInt();
            int Sell = sc.nextInt();
            HangHoa tempp = new HangHoa(ID,Name,Unit,Buy,Sell);
            ds.add(tempp);
        }
        Collections.sort(ds);
        for(HangHoa i:ds){
            System.out.println(i);
        }
    }
    
}
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000