/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UngDungJavaCollection.J08012_HinhSao;

import java.util.*;
public class NewMain {

    public static int setCenter(Edge a, Edge b){
        if(a.getVertex1() == b.getVertex1() || a.getVertex1() == b.getVertex2()) return a.getVertex1();
        if(a.getVertex1() == b.getVertex1() || a.getVertex2() == b.getVertex1()) return b.getVertex1();
        return -1;
    }
    public static String check(int center, ArrayList<Edge> graph){
        for(Edge x:graph){
            if(x.getVertex1() != center && x.getVertex2()!= center) return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Edge> graph = new ArrayList<>();
        while(n-- > 1){
            graph.add(new Edge(sc.nextInt(),sc.nextInt()));
        }
        if(graph.size()==1){
            System.out.println("Yes");
        }
        else{
            int centerVertex = 0;
            centerVertex = setCenter(graph.get(0), graph.get(1));
            if(centerVertex == -1){
                System.out.println("No");
            }
            else{
                System.out.println(check(centerVertex, graph));
            }
        }
    }
    
}
