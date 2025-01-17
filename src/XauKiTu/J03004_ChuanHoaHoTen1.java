/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.util.ArrayList;
import java.util.Scanner;
public class J03004_ChuanHoaHoTen1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String name = sc.nextLine().trim();
            name = name +" ";
            ArrayList<String> nameDetail = new ArrayList<>();
            String temp = "";
            for(int i=0; i<name.length(); i++){
                if(name.charAt(i) != ' '){
                    temp = temp + name.charAt(i);
                }
                if((name.charAt(i) != ' ' && name.charAt(i+1) == ' ') || (name.charAt(i) != ' ' && i==name.length()-1)){
                    nameDetail.add(temp);
                    temp="";
                }
            }
            temp="";
            for(String i:nameDetail){
                i = i.toLowerCase();
//                String.valueOf(i.charAt(0)).toUpperCase();
                i = String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1);
                temp += i + " ";
            }
            temp = temp.trim();
            System.out.println(temp);
        }
    }
}
//3
//   nGuYEN    vAN    naM
//tRan           TRUNG hiEU
//      vO le         hOA bINh