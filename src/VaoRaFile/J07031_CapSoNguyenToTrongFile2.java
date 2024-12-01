/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;
import java.io.*;
import java.util.*;
//public class Pair{
//    private Integer n,m;
//    
//}

public class J07031_CapSoNguyenToTrongFile2 {

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> n = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> m = (ArrayList<Integer>) in2.readObject();
        TreeSet<Integer> temp_n = new TreeSet<>();
        TreeSet<Integer> temp_m = new TreeSet<>();
        for(int x:n){
            if(isPrime(x)){
                temp_n.add(x);
            }
        }
        for(int x:m){
            if(isPrime(x)){
                temp_m.add(x);
            }
        }
        for(int x:temp_n){
            if(x<500000 && temp_n.contains(1000000-x) && temp_m.contains(1000000-x)==false && temp_m.contains(x)==false){
                System.out.println(x + " " + (1000000-x));
            }
        }
    }
    
}
