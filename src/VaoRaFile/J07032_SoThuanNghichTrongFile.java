/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07032_SoThuanNghichTrongFile {

    public static boolean check(String n){
        if(n.length()%2==0 || n.length()<=1) return false;
        
        StringBuilder number_TN = new StringBuilder(n).reverse();
        if(!number_TN.toString().equals(n)){
            return false;
        }
        
        for(int i=0; i<=n.length()/2; i++){
            if((n.charAt(i)-'0')%2 ==0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> number1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> number2 = (ArrayList<Integer>) in2.readObject();
        int quantity1[] = new int[1000001];
        int quantity2[] = new int[1000001];
        for(Integer x:number1){
            if(check(String.valueOf(x))){
                quantity1[x]++;
            }
        }
        for(Integer x:number2){
            if(check(String.valueOf(x))){
                quantity2[x]++;
            }
        }
        int cnt = 0;
        for(int i=0; i<=1000000; i++){
            if(cnt>=10){
                break;
            }
            if(quantity1[i]!=0 && quantity2[i]!=0){
                System.out.println(i + " " + (quantity1[i]+quantity2[i]));
                cnt++;    
            }
            
        }
    }
    
}
