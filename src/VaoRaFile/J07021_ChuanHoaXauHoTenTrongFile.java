/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07021_ChuanHoaXauHoTenTrongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.compareTo("END")==0){
                return;
            }
            String NewFullName = "";
            String[] FullName = s.trim().toLowerCase().split("\\s+");
            for(String PartName:FullName){
                String NewPartName = String.valueOf(PartName.charAt(0)).toUpperCase();
                for(int i=1;i<PartName.length(); i++){
                    NewPartName += PartName.charAt(i);
                }
                NewFullName += NewPartName + " ";
            }
            System.out.println(NewFullName);
        }
        
    }
    
}
