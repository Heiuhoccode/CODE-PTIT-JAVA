
package VaoRaFile;

import java.io.*;
import java.util.*;
public class J07029_SoNguyenToLonNhatTrongFile {

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        Map<Integer,Integer> quantity = new HashMap<>();
        TreeSet<Integer> prime = new TreeSet<>(Comparator.reverseOrder());
        ArrayList<Integer> numbers = (ArrayList<Integer>) in.readObject();
        for(int x:numbers){
            if(isPrime(x)){
                prime.add(x);
                int cnt = quantity.getOrDefault(x, 0) + 1;
                quantity.put(x, cnt);
            }
        }
        int cnt = 0;
        for(Integer temp:prime){
            if(cnt<10){
                System.out.println(temp + " " + quantity.get(temp));
                cnt++;
            }
        }
    }
    
}
