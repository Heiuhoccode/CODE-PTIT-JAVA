/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04008_ChuViTamGiac;


import static java.lang.Math.pow;
public class Point {
    private double x,y;
    //
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    //
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //
    public double distance(Point p){
        return (double)Math.sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
    //
    public double distance(Point p1, Point p2){
        return (double)Math.sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
    }
    //
    public String toString(){
        return "x = " + x + ", y = " + y;
    }
}
