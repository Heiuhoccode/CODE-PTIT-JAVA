/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05018_BangDiemHocSinh;

import java.util.*;
public class J05018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> dshs = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;  i<=n; i++){
            dshs.add(new HocSinh(i,sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(dshs);
        for(HocSinh hs:dshs){
            System.out.println(hs);
        }
    }
//3
//Luu Thuy Nhi
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
}
