/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04020_LopPair;

public class Pair <T1 extends Number,T2 extends Number>{
    private T1 num1;
    private T2 num2;
    //
    public Pair (T1 num1, T2 num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public T1 getNum1(){
        return num1;
    }
    public T2 getNum2(){
        return num2;
    }
    public boolean isPrimeOfPart(Number num){
        int temp = num.intValue();
        if(temp<2) return false;
        for(int i=2; i<=Math.sqrt(temp); i++){
            if(temp%i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(){
        return isPrimeOfPart(num1)&&isPrimeOfPart(num2);
    }
    public String toString(){
        return num1 +" " +num2;
    }
}


