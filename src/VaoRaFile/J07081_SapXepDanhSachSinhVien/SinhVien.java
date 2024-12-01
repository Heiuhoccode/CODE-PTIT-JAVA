
package VaoRaFile.J07081_SapXepDanhSachSinhVien;

import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
    private String id, name,firstName, centerName, lastName, phoneNumber, email;
    //
    public SinhVien(String id, String name, String phoneNumber, String email){
        this.id = id;
        this.name = name;
        this.firstName = FirstName(name);
        this.centerName = CenterName(name);
        this.lastName = LastName(name);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    //
    public String FirstName(String fullName){
        String firstName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        firstName = partFullName[0];
        return firstName;
    }
    //
    public String CenterName(String fullName){
        String centerName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        for(int i=1; i<partFullName.length-1; i++){
            centerName += partFullName[i] + " ";
        }
        centerName = centerName.trim();
        return centerName;
    }
    //
    public String LastName(String fullName){
        String lastName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        lastName = partFullName[partFullName.length-1];
        return lastName;
    }
    //
    public int compareTo(SinhVien other){
        if(this.lastName.equals(other.lastName)){
            if(this.firstName.equals(other.firstName)){
                if(this.centerName.equals(other.centerName)){
                    return this.id.compareTo(other.id);
                }
                return this.centerName.compareTo(other.centerName);
            }
            return this.firstName.compareTo(other.firstName);
        }
        return this.lastName.compareTo(other.lastName);
    }
    //
    public String toString(){
        return id + " " + name + " " + phoneNumber + " " + email;
    }
}
