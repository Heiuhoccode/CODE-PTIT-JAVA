/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;
import java.util.*;
/**
 *
 * @author admin
 */
public class J03006_SoDep1 {

    public static String check(String number){
        for(int i=0; i<number.length()/2; i++){
            if(number.charAt(i) != number.charAt(number.length()-i-1)){
                return "NO";
            }
            if( number.charAt(i)!='0' && number.charAt(i)!='2' &&number.charAt(i)!='4' &&number.charAt(i)!='6' &&number.charAt(i)!='8'){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String number = sc.nextLine();
            System.out.println(check(number));
        }
    }
}
//4
//123456787654321
//86442824468
//8006000444422220000222244440006008
//235365789787654324567856578654356786556