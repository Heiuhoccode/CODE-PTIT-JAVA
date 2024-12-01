
package VaoRaFile;

import java.util.*;
import java.io.*;
public class J07076_SapXepMaTran {
    public int compareTo(int a, int b){
        return a - b;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int column = sc.nextInt();
            int[] arrColumn = new int[n];
            int[][] arr = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                    if(j+1 == column){
                        arrColumn[i] = arr[i][j];
                    }
                }
            }
            Arrays.sort(arrColumn);
            for(int i=0; i<n; i++){
                arr[i][column-1] = arrColumn[i];
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println("");
            }
        }
    }
    
}
