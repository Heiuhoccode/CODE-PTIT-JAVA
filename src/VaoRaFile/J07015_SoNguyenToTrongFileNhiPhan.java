/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;
import java.io.*;
import java.util.*;
/**
 *
 * @author admin
 */
public class J07015_SoNguyenToTrongFileNhiPhan {
    public static boolean isprime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> number = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> result = new TreeSet<>();
        int quantity[] = new int[10000];
        for(Integer i:number){
            if(isprime(i)){
                quantity[i]++;
                result.add(i);
            }
        }
        for(Integer i:result){
            System.out.println(i + " " + quantity[i]);
        }
    }
}
