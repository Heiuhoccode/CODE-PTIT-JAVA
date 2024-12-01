/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAITAP.Bai1_2;

/**
 *
 * @author admin
 */
public class Pair <t1,t2>{
    private t1 first;
    private t2 second;
    
    public Pair(t1 first, t2 second){
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        if((Integer) this.first < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt((Integer) this.first); i++){
            if((Integer) this.first %i==0) return false;
        }
        if((Integer) this.second < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt((Integer) this.second); i++){
            if((Integer) this.second %i==0) return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return this.first +" "+this.second;
    }
}
