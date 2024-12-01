/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
import java.math.*;
public class J03035_XauDoiXung {

    public static String check(String string){
        int limit = 0;
        for(int i=0; i<string.length()/2; i++){
//            if(limit>1){
//                return "NO";
//            }
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                limit++;
            }
            if(limit>1){
                return "NO";
            }
        }
        if(string.length()%2==0 && limit == 0){
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        while(n-- > 0){
            String string = sc.nextLine();
            System.out.println(check(string));
        }
    }
    
}
//3
//abccaa
//abbcca
//abcda
