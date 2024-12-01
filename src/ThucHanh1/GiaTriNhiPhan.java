/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author admin
 */
public class GiaTriNhiPhan {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> Binary = (ArrayList<String>) in.readObject();
        for(String s:Binary){
            StringBuilder temp = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0' || s.charAt(i)=='1'){
                    temp.append(s.charAt(i));
                }
            }
            String temp2 = temp.toString();
            long cnt = Long.parseLong(temp2, 2);
            System.out.println(temp2 + " " +cnt);
        }
        in.close();
    }
    
}
