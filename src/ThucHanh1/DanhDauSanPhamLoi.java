/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1;
import java.util.*;
/**
 *
 * @author admin
 */
public class DanhDauSanPhamLoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] err = new int[m];
        for(int i=0; i<m; i++){
            err[i] = sc.nextInt();
        }
        System.out.print("Errors: ");
        StringBuilder res = new StringBuilder();
        boolean range = false;
        int eor;
        int i=0;
        for(; i<m-1; i++){
            res.append(err[i]);
            if(err[i+1] - err[i] ==1){
                range = true;
                res.append("-");
                eor=i+1;
                for(int j=eor; j<m-1; j++){
                    if(err[j+1] - err[j] == 1){
                        eor = j+1;
                    }
                    else{
                        break;
                    }
                }
                i = eor;
                res.append(err[eor] + ", ");
            }
            else{
                res.append(", ");
            }
        }
        if(err[m-1] - err[m-2] != 1){
            res.delete(res.length()-2,res.length());
            res.append(" and " + err[m-1]);
        }
        else{
            res.delete(res.length()-2,res.length());
            StringBuilder lastRange = new StringBuilder();
            int k = res.length()-1;
            while(res.charAt(k)!=','){
                k--;
            }
            lastRange.append(res.substring(k+2));
            res.delete(k,res.length());
            res.append(" and " + lastRange.toString());
        }
        System.out.println(res.toString());
        
        int h = n-m;
        int[] c = new int[h];
        int ide =0, idc=0;
        for(int j=1; j<=n; j++){
            if(ide < m && j== err[ide]){
                ide++;
            }
            else{
                c[idc] = j;
                idc++;
            }
        }
        System.out.print("Correct: ");
        res = new StringBuilder();
        range = false;
        eor=0;
        i=0;
        for(; i<h-1; i++){
            res.append(c[i]);
            if(c[i+1] - c[i] ==1){
                range = true;
                res.append("-");
                eor=i+1;
                for(int j=eor; j<h-1; j++){
                    if(c[j+1] - c[j] == 1){
                        eor = j+1;
                    }
                    else{
                        break;
                    }
                }
                i = eor;
                res.append(c[eor] + ", ");
            }
            else{
                res.append(", ");
            }
        }
        if(c[h-1] - c[h-2] != 1){
            res.delete(res.length()-2,res.length());
            res.append(" and " + c[h-1]);
        }
        else{
            res.delete(res.length()-2,res.length());
            StringBuilder lastRange = new StringBuilder();
            int k = res.length()-1;
            while(res.charAt(k)!=','){
                k--;
            }
            lastRange.append(res.substring(k+2));
            
            res.delete(k,res.length());
            res.append(" and " + lastRange.toString());
        }
        System.out.println(res.toString());
    }
}
