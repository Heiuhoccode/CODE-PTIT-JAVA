/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J04018_SoPhuc;

import java.util.*;
public class J04018 {

    public static SoPhuc CalculateC(SoPhuc A, SoPhuc B){
        SoPhuc C = new SoPhuc(1,1);
        C = C.Sum(A, B);
        C = C.Multip(C, A);
        return C;
    }
    public static SoPhuc CalculateD(SoPhuc A, SoPhuc B){
        SoPhuc D = new SoPhuc(1,1);
        D = D.Sum(A, B);
        D = D.Multip(D, D);
        return D;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc C = CalculateC(A,B);
            SoPhuc D = CalculateD(A,B);
            System.out.println(C+", "+D);
        }
    }
    
}
