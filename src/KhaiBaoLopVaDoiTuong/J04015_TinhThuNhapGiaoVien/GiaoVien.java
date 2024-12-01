/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04015_TinhThuNhapGiaoVien;

import static java.lang.Math.*;
public class GiaoVien {
    private String Position, Name, ID;
    private long Coefficient;
    private long Allowance;
    private long Salary;
    private long Salary_base;
    //
    public String getPosition(){
        return position(getID());
    }
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    public long getCoefficient(){
        return Coefficient;
    }
    public long getAllowance(){
        return Allowance;
    }
    public long getSalary(){
        return Salary;
    }
    public long getSalary_base(){
        return Salary_base;
    }
    //
    public GiaoVien(String ID, String Name, long Salary_base){
        this.ID = ID;
        this.Name = Name;
        this.Salary_base = Salary_base;
    }
    //
    public String position(String ID){
        this.Position = String.valueOf(ID.charAt(0)) + String.valueOf(ID.charAt(1));
        return this.Position;
    }
    //
    public long coefficient(String ID){
        String temp = String.valueOf(ID.charAt(2)) + String.valueOf(ID.charAt(3));
        this.Coefficient = Integer.parseInt(temp);
        return this.Coefficient;
    }
    //
    public long allowance(String position){
        if(position.compareTo("HT")==0){
            this.Allowance = 2000000;
        }
        else if(position.compareTo("HP")==0){
            this.Allowance = 900000;
        }
        else if(position.compareTo("GV")==0){
            this.Allowance = 500000;
        }
        return this.Allowance;
    }
    //
    public long salary(long salary_base, long coefficient, long allowance){
        this.Salary = salary_base * coefficient + allowance;
        return this.Salary;
    }
    //
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d", getID(), getName(), coefficient(getID()), allowance(position(getID())), salary(getSalary_base(),coefficient(getID()),allowance(position(getID()))));
    }
}
