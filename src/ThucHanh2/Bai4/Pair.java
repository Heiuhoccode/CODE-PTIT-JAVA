/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2.Bai4;

public class Pair <T1 extends Comparable<T1>,T2 extends Comparable<T2>> implements Comparable<Pair<T1,T2>>{
    private T1 row;
    private T2 column;
    //
    public Pair (T1 row, T2 column){
        this.row = row;
        this.column = column;
    }
    @Override
    public int compareTo(Pair<T1,T2> other){
        if(this.row.compareTo(other.row) == 0){
            return this.column.compareTo(other.column);
        }
        return this.row.compareTo(other.row);
    }
    public String toString(){
        return "(" + row + "," + column + ")";
    }
}
