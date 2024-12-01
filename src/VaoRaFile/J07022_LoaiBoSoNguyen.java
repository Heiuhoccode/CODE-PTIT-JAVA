/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;
import java.util.*;
import java.io.*;
/**
 *
 * @author admin
 */
public class J07022_LoaiBoSoNguyen {

    public static boolean check(String m){
        boolean check1 = false;
        for(int i=0; i<m.length(); i++){
            if(m.charAt(i) < '0' || m.charAt(i) >'9' ){
                check1 = true;
                break;
            }
        }
        return check1 ;
    }
    public static boolean check2(String m){
        boolean check1 = false, check2 = false;
        if(m.length()>10){
            check1 = true;
        }
        else if(m.length()==10){
            if(m.compareTo("2147483647") >0) check2 = true;
        }
        if(check1 || check2 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> n = new ArrayList<>();
        while(sc.hasNext()){
            String m = sc.next();
            if(check(m)||check2(m)){
                n.add(m);
            }
        }
        Collections.sort(n);
        for(String t:n){
            System.out.print(t +" ");
        }
    }
    
}
