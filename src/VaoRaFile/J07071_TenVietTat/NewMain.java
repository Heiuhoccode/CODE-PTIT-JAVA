/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07071_TenVietTat;

import java.io.*;
import java.util.*;
public class NewMain {

    public static String change(String abbreviate){
        String newAB = "";
        String[] partAB = abbreviate.split("\\.");
        for(String x:partAB){
            newAB += x;
        }
        return newAB;
    }
    
    public static boolean check(Name name, String abbreviate){
        if(name.getAbbreviate().length() != abbreviate.length()) return false;
        for(int i=0; i<abbreviate.length(); i++){
            if(abbreviate.charAt(i)=='*') continue;
            if(abbreviate.charAt(i) != name.getAbbreviate().charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Name> dsname = new ArrayList<>();
        while(n-- > 0){
            dsname.add(new Name(sc.nextLine()));
        }
        int require = Integer.parseInt(sc.nextLine());
        while(require-- > 0){
            String abbreviate = change(sc.nextLine());
            ArrayList<Name> result = new ArrayList<>();
            for(Name temp:dsname){
                if(check(temp,abbreviate)){
                    result.add(temp);
                }
            }
            Collections.sort(result);
            for(Name temp:result){
                System.out.println(temp);
            }
        }
    }
    
}
