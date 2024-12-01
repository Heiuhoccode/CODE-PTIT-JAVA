/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05009_TimThuKhoaCuaKiThi;

import java.util.*;
public class J05009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        double max = 0.0;
        for(int i=1; i<=t; i++){
            int id = i;
            String name = sc.nextLine();
            String dateOB = sc.nextLine();
            double score1 = Double.parseDouble(sc.nextLine());
            double score2 = Double.parseDouble(sc.nextLine());
            double score3 = Double.parseDouble(sc.nextLine());
            if(max < (score1+score2+score3)){
                max = (score1+score2+score3);
            }
            dsts.add(new ThiSinh(id, name, dateOB, score1, score2, score3));
        }
        Collections.sort(dsts);
        for(ThiSinh ts:dsts){
            if(ts.getSum()==max){
                System.out.println(ts);
            }
        }
    }
    
}
