/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04002_KhaiBaoLopHinhChuNhat;

import java.lang.*;
public class Rectange {
    private double width, height;
    private String color;
    //
    public Rectange(){
        width = 1; height = 1;
    }
    public Rectange(double width, double height, String color){
        this.color = color;
        this.height = height;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public Rectange setWidth(double width){
        this.width = width;
        return this;
    }
    public double getHeight(){
        return height;
    }
    public Rectange setHeight(double height){
        this.height = height;
        return this;
    }
    public String getColor(){
        return color;
    }
    public Rectange setColor(String color){
        this.color = color;
        return this;
    }
    //
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }
    //
    public String toString(){
        return String.format("%d %d %s", (int)findPerimeter(),(int)findArea(), getColor());
    }
}
