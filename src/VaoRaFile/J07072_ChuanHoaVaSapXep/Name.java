/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07072_ChuanHoaVaSapXep;
import java.util.*;
public class Name implements Comparable<Name>{
    private String fullName;
    private String firstName,centerName, lastName;
    //
    public Name(String fullName){
        this.fullName = changeName(fullName);
        this.firstName = splitName_1(this.fullName);
        this.centerName = splitName_2(this.fullName);
        this.lastName = splitName_3(this.fullName);
    }
    //
    public String changeName(String fullName){
        String newFullName = "";
        String[] partName = fullName.trim().split("\\s+");
        for(String partname:partName){
            newFullName += String.valueOf(partname.charAt(0)).toUpperCase() + partname.substring(1).toLowerCase() + " ";
        }
        newFullName = newFullName.trim();
        return newFullName;
    }
    //
    public String splitName_1(String fullName){
        String firstName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        firstName = partFullName[0];
        return firstName;
    }
    //
    public String splitName_2(String fullName){
        String centerName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        for(int i=1; i<partFullName.length-1; i++){
            centerName += partFullName[i] + " ";
        }
        centerName = centerName.trim();
        return centerName;
    }
    //
    public String splitName_3(String fullName){
        String lastName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        lastName = partFullName[partFullName.length-1];
        return lastName;
    }
    //
    public int compareTo(Name other){
        if(this.lastName.equals(other.lastName)){
            if(this.firstName.equals(other.firstName)){
                return this.centerName.compareTo(other.centerName);
            }
            return this.firstName.compareTo(other.firstName);
        }
        return this.lastName.compareTo(other.lastName);
    }
    //
    public String toString(){
        return fullName;
    }
}
