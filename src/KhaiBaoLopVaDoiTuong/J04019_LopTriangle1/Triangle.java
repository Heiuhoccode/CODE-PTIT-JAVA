/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04019_LopTriangle1;

import java.util.*;
public class Triangle {
    private Point A, B, C;
    private double AB, BC, AC;
    //
    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        this.AB = distance(A,B);
        this.BC = distance(B,C);
        this.AC = distance(A,C);
    }
    //
    public double distance(Point A, Point B){
        return Math.sqrt((A.getX() - B.getX())*(A.getX() - B.getX()) + (A.getY() - B.getY())*(A.getY() - B.getY()));
    }
    //
    public double getPerimeter(){
        return Double.parseDouble(String.format("%.3f", AB+BC+AC));
    }
    //
    public boolean valid(){
        if(AB + BC <= AC || AB + AC <= BC || BC + AC <= AB){
            return false;
        }
        return true;
    }
}
