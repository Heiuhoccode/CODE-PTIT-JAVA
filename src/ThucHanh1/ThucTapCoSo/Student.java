/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.ThucTapCoSo;

/**
 *
 * @author admin
 */
class Student {
    public String id, name, sdt, email;
    public Student(String id,String name,String sdt, String email){
        this.id = id;
        this.email = email;
        this.name = name;
        this.sdt = sdt;
    }
    public String toString(){
        return id + " " + name + " " + sdt + " " + email;
    }
}
