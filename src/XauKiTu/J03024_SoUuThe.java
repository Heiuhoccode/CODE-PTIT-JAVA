/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
import java.math.*;
public class J03024_SoUuThe {

    public static String check(String a){
        int cnt = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)<48 || a.charAt(i) > 57){
                return "INVALID";
            }
            if(a.charAt(i) % 2 == 0){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        if((a.length()%2 !=0 && cnt<0)||(a.length()%2==0 && cnt>0)){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        while(n-- > 0){ 
            String SuperiorityNumber = sc.nextLine();
            System.out.println(check(SuperiorityNumber));
        }
    }
    
}
//3
//01234aa32432432432534545b987978
//1234567890123456789000
//999999999999999999999999999999