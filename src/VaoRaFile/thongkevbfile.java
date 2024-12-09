package VaoRaFile;
import java.util.*;
import java.io.*;

public class thongkevbfile {
    
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> mp = new HashMap<>();
        while(t -- >0){
            String s = sc.nextLine().toLowerCase();
            String[] a = s.trim().split("\\W\\s*");
            for(int i=0; i<a.length; i++){
                if(!a[i].contentEquals("")){
                    mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
                }
                
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, (o1,o2) ->{
            int cmp = o2.getValue().compareTo(o1.getValue());
            if(cmp == 0){
                return o1.getKey().compareTo(o2.getKey());
            }
            return cmp;
        });
        
        for(Map.Entry<String, Integer> entry : list){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    
}