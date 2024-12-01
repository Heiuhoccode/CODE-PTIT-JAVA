/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.ThucTapCoSo;

/**
 *
 * @author admin
 */
class Assignment implements Comparable<Assignment>{
    public String stuID, subID;
    public Student stu;
    public Subject sub;
    public Assignment(String msv, String subID){
        this.stuID = msv;
        this.subID = subID;
    }
    public int comppareTo(Assignment that){
        return sub.subjectName.compareTo(that.sub.subjectName);
    } 
    public String toString(){
        return stu.toString() + " " + sub.toString();
    }

    @Override
    public int compareTo(Assignment o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
