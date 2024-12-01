/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP;

import java.util.*;
public class LietKeVaDem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap();
        TreeSet<Integer> treeset = new TreeSet<>();
        while(sc.hasNext()){
            Integer x = sc.nextInt();
            treeset.add(x);
            int cnt = map.getOrDefault(x, 0) + 1;
            map.put(x, cnt);
            if(x==0) break;
        }
        for(Integer i:treeset){
            System.out.println(i + " " + map.get(i));
        }
//        
    }
}