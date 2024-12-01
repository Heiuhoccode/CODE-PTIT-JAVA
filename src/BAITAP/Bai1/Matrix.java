/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAITAP.Bai1;

/**
 *
 * @author admin
 */
public class Matrix {
    private int sohang, socot;
    private int giatri[][];
    
    public Matrix(Matrix a){
        this.sohang = a.sohang;
        this.socot = a.socot;
        this.giatri = a.giatri;
    }
    
    public Matrix(int sohang, int socot, int giatri[][]){
        this.sohang = sohang;
        this.socot = socot;
        this.giatri = giatri;
    }
    
    public Matrix sapxepcot(int position){
        position-=1;
        Matrix a = this;
        for(int i=0; i<sohang-1; i++){
            for(int j=i+1; j<sohang; j++){
                if(a.giatri[i][position] > a.giatri[j][position]){
                    int temp = a.giatri[i][position];
                    a.giatri[i][position] = a.giatri[j][position];
                    a.giatri[j][position] = temp;
                }
            }
        }
        return a;
    }
    
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        for(int i=0; i<sohang; i++){
            for(int j=0; j<socot; j++){
                st.append(giatri[i][j]);
                st.append(" ");
            }
            st.append("\n");
        }
        return st.toString();
    }
}
