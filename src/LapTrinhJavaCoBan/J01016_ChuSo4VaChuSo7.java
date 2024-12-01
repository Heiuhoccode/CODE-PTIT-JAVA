/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import java.util.*;
/**
 *
 * @author admin
 */
public class J01016_ChuSo4VaChuSo7 {
    public static Scanner sc = new Scanner(System.in);
    public static int analysis(String number){
        int number_4 = 0;
        int number_7 = 0;
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == '4'){
                number_4++;
            }
            else if(number.charAt(i) == '7'){
                number_7++;
            }
        }
        if((number_4 + number_7) == 4 ||(number_4 + number_7) == 7 ){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        String number = sc.nextLine();
        int choose = analysis(number);
        switch(choose){
            case 0:
                System.out.println("NO");
                break;
            case 1:
                System.out.println("YES");
                break;
        }
    }
}
