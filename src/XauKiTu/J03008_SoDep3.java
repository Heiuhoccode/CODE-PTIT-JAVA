/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
public class J03008_SoDep3 {
    public static int isprime(int n){
        n-=48;
        if(n<2) return 0;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static String check(String number){
        
        for(int i=0; i<number.length()/2; i++){
            if(number.charAt(i)!=number.charAt(number.length()-i-1) || isprime(number.charAt(i))==0){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        while(n-- > 0){
            String number = sc.nextLine();
            System.out.println(check(number));
        }
    }
    
}
//3
//123456787654321
//235755557532
//2222333355557777235775327777555533332222