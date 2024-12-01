/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.ThucTapCoSo;

/**
 *
 * @author admin
 */
class Subject {
    public static int num = 1;
    public String id, lecturerName, subjectName;
    public Subject(String lecturerName, String subjectName){
        this.id = String.format("DT%03d", num++);
        this.lecturerName = lecturerName;
        this.subjectName =  subjectName;
    }
    public String toString(){
        return lecturerName + " " + subjectName;
    }
}
