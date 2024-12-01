/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2;
import java.io.*;
import java.util.*;
/**
 *
 * @author admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> Data1 = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> Data2 = (ArrayList<Integer>) in2.readObject();
        TreeSet<String> Result = new TreeSet<>();
        for(String x1:Data1){
            for(Integer x2:Data2){
                Result.add(x1+x2);
            }
        }
        for(String res:Result){
            System.out.println(res);
        }
    }
    
}
