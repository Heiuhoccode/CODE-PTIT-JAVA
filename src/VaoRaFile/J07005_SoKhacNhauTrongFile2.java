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
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int quantity[] = new int[1000];
        for(int i=0; i<100000; i++){
            quantity[in.readInt()]++;
        }
        for(int j=0; j<1000; j++){
            if(quantity[j] > 0){
                System.out.println(j + " " + quantity[j]);
            }
        }
    }
}
