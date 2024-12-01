/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J04018_SoPhuc;

import java.util.*;
public class SoPhuc {
    private int a,b;
    //
    public SoPhuc(int a, int b){
        this.a = a;
        this.b = b;
    }
    //
    public SoPhuc Sum(SoPhuc A, SoPhuc B){
        return (new SoPhuc(A.a+B.a, A.b+B.b));
    }
    public SoPhuc Multip(SoPhuc A, SoPhuc B){
        int a = A.a*B.a - A.b*B.b;
        int b = A.a*B.b + A.b*B.a;
        return (new SoPhuc(a,b));
    }
    //
    public String toString(){
        if(b<0){
            b *= (-1);
            return a + " - " + b +"i";
        }
        return a + " + " + b +"i";
    }
}
