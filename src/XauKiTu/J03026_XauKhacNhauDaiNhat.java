/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
import java.math.*;
public class J03026_XauKhacNhauDaiNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> a = new Stack<>();
        String S = sc.nextLine();
        a.push(String.valueOf(S.charAt(0)));
        for(int i=1; i<S.length(); i++){
            a.push(String.valueOf(S.charAt(i)));
            if(a.size()>1){
                String ss1 = a.pop();
                String ss2 = a.pop();
//                System.out.print(" ss1 = " + ss1 + " ss2 = " + ss2 + " xoa");
                if(ss1.compareTo(ss2)!=0){
                    a.push(ss2);
                    a.push(ss1);
//                    System.out.print(" và add lai");
                }
//                System.out.println("");
            }
        }
        if(a.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            String result = "";
            while(!a.isEmpty()){
                result = a.pop() + result;
            }
            System.out.println(result);
        }
    }
}
