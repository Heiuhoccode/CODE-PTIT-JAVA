/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.util.*;
public class J03007_SoDep2 {
    public static String check(String number){
        if(number.charAt(0)!='8' || number.charAt(number.length()-1) != '8'){
            return "NO";
        }
        for(int i=0; i<number.length()/2; i++){
            if(number.charAt(i) != number.charAt(number.length()-i-1)){
                return "NO";
            }
        }
        long sum = 0;
        for(int i=0; i<number.length(); i++){
            sum += (number.charAt(i)-48);
        }
        if(sum%10 != 0 ){
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String number = sc.nextLine();
//            long sum = 0;
//            for(int i=0; i<number.length(); i++){
//                sum += number.charAt(i)-48;
//            }
//            System.out.println(sum);
            System.out.println(check(number));
        }
    }
}
//4
//123456787654321
//8644281154664511824468
//8006000444400000000000044440006008
//82123400000000000000000000000432128