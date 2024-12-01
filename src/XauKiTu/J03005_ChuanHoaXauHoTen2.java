/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.util.*;
public class J03005_ChuanHoaXauHoTen2 {

    public static String Implement(String i){
        String name = "";
        name = i.toLowerCase();
        name = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1);
        return name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String name = sc.nextLine().trim();
            String[] nameDetail = name.split("\\s+");
            //ArrayList<String> newName = new ArrayList<>();
            String newName = "";
            for(int  i=1; i<nameDetail.length; i++){
                newName += Implement(nameDetail[i]) + " ";
            }
            newName = newName.trim();
            newName += ", " + nameDetail[0].toUpperCase();
            System.out.println(newName);
//            String newName = "";
//            for(int i=1; i<nameDetail.length; i++){
//                newName += nameDetail[i] + " ";
//            }
//            newName.trim();
//            newName += ", " + nameDetail[0];
//            System.out.println(newName);
        }
    }
}
//4
//    nGUYEn    quaNG  vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH