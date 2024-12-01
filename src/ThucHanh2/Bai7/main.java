/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2.Bai7;
import java.util.*;
import java.io.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        Set<String> check = new HashSet<>();
        while(sc.hasNext()){
            String id = sc.nextLine();
            if(check.contains(id)){
                sc.nextLine();
                sc.nextLine();
                continue;
            }
            check.add(id);
            MonHoc temp = new MonHoc(id,sc.nextLine(),sc.nextLine());
            dsmh.add(temp);
        }
        Collections.sort(dsmh);
        for(MonHoc x:dsmh){
            System.out.println(x);
        }
    }
    
}
