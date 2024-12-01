/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XauKiTu;

import java.util.*;
import java.io.*;
public class J03021_DienThoaiCucGach {

    public static String check(String number){
        for(int i=0; i<number.length()/2; i++){
            if(number.charAt(i) != number.charAt(number.length()-i-1)){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Map Phone = new HashMap<>();
        Phone.put('a', '2');
        Phone.put('b', '2');
        Phone.put('c', '2');
        Phone.put('d', '3');    
        Phone.put('e', '3');
        Phone.put('f', '3');
        Phone.put('g', '4');
        Phone.put('h', '4');
        Phone.put('i', '4');
        Phone.put('j', '5');
        Phone.put('k', '5');
        Phone.put('l', '5');    
        Phone.put('m', '6');
        Phone.put('n', '6');
        Phone.put('o', '6');
        Phone.put('p', '7');     
        Phone.put('q', '7');
        Phone.put('r', '7');
        Phone.put('s', '7');
        Phone.put('t', '8');
        Phone.put('u', '8');    
        Phone.put('v', '8');
        Phone.put('w', '9');
        Phone.put('x', '9');        
        Phone.put('y', '9');
        Phone.put('z', '9');        
        while(n-- > 0) {
            String mess = sc.nextLine().toLowerCase();           
            String number = "";
            for(int i=0; i<mess.length(); i++){
                number += Phone.get(mess.charAt(i));
            }
            System.out.println(check(number));
        }
    }
    
}
//2
//BOHIMA
//IamACoder