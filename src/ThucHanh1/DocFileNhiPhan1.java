///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
package ThucHanh1;
import java.io.*;
import java.util.*;
/**
 *
 * @author admin
 */
public class DocFileNhiPhan1 {

    /**
     * @param args the command line arguments
     */
    public static boolean SNT(int n){
        if(n<2) return false;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        // TODO code application logic here
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> number = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer temp : number){
            if(temp >= 100 && SNT(temp)){
                result.add(temp);
            }
        }
        for(Integer temp : result){
            System.out.println(temp);
        }
    } 
}