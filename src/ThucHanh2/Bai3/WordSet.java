/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2.Bai3;
import java.io.*;
import java.util.*;
public class WordSet {
    private String A[];
    
    public WordSet(String temp){
        this.A = temp.trim().toLowerCase().split("\\s+");
    }
    public String union (WordSet other){
        TreeSet<String> union = new TreeSet<>();
        for(String x:this.A){
            union.add(x);
        }
        for(String x:other.A){
            union.add(x);
        }
        String res = "";
        for(String x:union){
            res += x + " ";
        }
        return res;
    }
    public String intersection (WordSet other){
        Set<String> temp1 = new TreeSet<>();
        Set<String> temp2 = new TreeSet<>();
        for(String x:this.A){
            temp1.add(x);
        }
        for(String x:other.A){
            temp2.add(x);
        }
        Set<String> giao = new TreeSet<>();
        giao.addAll(temp1);
        giao.retainAll(temp2);
        String res = "";
        for(String x:giao){
            res += x + " ";
        }
        return res;
    }
}
