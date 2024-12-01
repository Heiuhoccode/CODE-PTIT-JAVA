/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07059_DanhSachCaThi;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner ( new File("CATHI.in"));
        ArrayList<CaThi> dsct = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        for(int i=1; i<=n; i++){
            dsct.add(new CaThi(i, LocalDate.parse(sc.nextLine(),formatDate), LocalTime.parse(sc.nextLine(),formatTime), sc.nextLine()));
        }
        Collections.sort(dsct);
        for(CaThi cathi:dsct){
            System.out.println(cathi);
        }
    }
    
}
