/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07072_ChuanHoaVaSapXep;

import java.util.*;
import java.io.*;
public class J07072_ChuanHoaVaSapXep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> dsName = new ArrayList<>();
        while(sc.hasNext()){
            dsName.add(new Name(sc.nextLine()));
        }
        Collections.sort(dsName);
        for(Name temp:dsName){
            System.out.println(temp);
        }
    }
    
}
