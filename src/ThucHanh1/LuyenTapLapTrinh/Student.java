/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.LuyenTapLapTrinh;

/**
 *
 * @author admin
 */
class Stu implements Comparable<Stu> {
    public String Ten;
    public int AC, Submit;
    public  Stu(String Ten, int AC, int Submit){
        this.Ten = Ten;
        this.AC = AC;
        this.Submit = Submit;
    }
    public int compareTo(Stu that){
        if(this.AC == that.AC){
            if(this.Submit == that.Submit){
                return this.Ten.compareTo(that.Ten);
            }
            return this.Submit - that.Submit;
        }
        return that.AC - this.AC;
    }
    @Override
    public String toString(){
        return Ten + " " + AC + " " + Submit;
    }
}
