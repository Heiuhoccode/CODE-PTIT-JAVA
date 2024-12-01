/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1;
import java.util.*;
import java.io.*;
/**
 *
 * @author admin
 */
public class XuLyVanBan2 {
    private static boolean check(String s){
        boolean check1 = false, check2 = true;
        for(int i=0; i<s.length(); i++){
            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                check1 = true;
            }
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '.' || s.charAt(i) == ',' ||s.charAt(i) == '!' ||s.charAt(i) == '?' ||s.charAt(i) == ':'){
                check1 = false;
            }
        }
        return check1 && check2;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> temp = new HashSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                temp.add(s);
            }
        }
        List<String> result = new ArrayList<>(temp);
        Collections.sort(result);
        for(String i:result){
            System.out.println(i);
        }
        sc.close();
    }
    
}
