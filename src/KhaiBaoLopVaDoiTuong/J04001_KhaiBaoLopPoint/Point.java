/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04001_KhaiBaoLopPoint;

import static java.lang.Math.*;
public class Point {
    private double x,y;
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        return x + " " + y;
    }
    
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point temp){
        this.x = temp.x;
        this.y = temp.y;
    }
    public double distance(Point temp){
        return sqrt(pow(this.x - temp.x, 2) + pow(this.y - temp.y, 2));
    }
    public double distance(Point a, Point b){
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }
}
