
package VaoRaFile.J07071_TenVietTat;
import java.util.*;
public class Name implements Comparable<Name>{
    private String fullName, abbreviatedName;
    private String firstName, lastName;
    //
    public Name(String fullName){
        this.fullName = fullName;
        this.firstName = splitName_1(fullName);
        this.lastName = splitName_2(fullName);
        this.abbreviatedName = Abbreviate(fullName);
    }
    //
    public String getAbbreviate(){
        return abbreviatedName;
    }
    //
    public String splitName_1(String fullName){
        String firstName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        for(int i=0; i<partFullName.length-1; i++){
            firstName += partFullName[i] + " ";
        }
        return firstName;
    }
    //
    public String splitName_2(String fullName){
        String lastName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        lastName = partFullName[partFullName.length-1];
        return lastName;
    }
    //
    public String Abbreviate(String fullName){
        String abbreviateName = "";
        String[] partFullName = fullName.trim().split("\\s+");
        for(String temp:partFullName){
            abbreviateName += String.valueOf(temp.charAt(0));
        }
        return abbreviateName;
    }
    //
    public int compareTo(Name other){
        if(this.lastName.equals(other.lastName)){
            return this.firstName.compareTo(other.firstName);
        }
        return this.lastName.compareTo(other.lastName);
    }
    //
    public String toString(){
        return fullName ;
    }
}
