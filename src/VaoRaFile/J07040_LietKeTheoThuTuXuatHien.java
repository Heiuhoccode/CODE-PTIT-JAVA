/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07040_LietKeTheoThuTuXuatHien {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> nhiPhanA = (ArrayList<String>) in.readObject();
        Set<String> nhiPhanS = new LinkedHashSet<>();
        for(String temp:nhiPhanA){
            String[] temp1 = temp.trim().toLowerCase().split("\\s+");
            for(String x:temp1){
                nhiPhanS.add(x);
            }
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> vanBanS = new LinkedHashSet<>();
        while(sc.hasNext()){
            String vanBan = sc.nextLine();
            String[] temp1 = vanBan.trim().toLowerCase().split("\\s+");
            for(String x:temp1){
                vanBanS.add(x);
            }
        }

        for(String x:vanBanS){
            if(nhiPhanS.contains(x)){
                System.out.println(x);
            }
        }

    }
    
}
