
package UngDungJavaCollection;
import java.util.*;
public class J08015_CapSoCoTongBangK {

    public static long searchBinary_tren(long arr[], long x, int first, int last){
        long result = last + 1;
        while(first <= last){
            int mid = first + (last-first)/2;
            if(arr[mid]==x){
                result = mid;
                first = mid + 1;
            }
            else if(arr[mid] >= x){
                last = mid -1;
            }
            else{
                first = mid + 1;
            }
               
        }
        return result;
    }
    public static long searchBinary_duoi(long arr[], long x, int first, int last){
        long result = last + 1;
        while(first <= last){
            int mid = first + (last-first)/2;
            if(arr[mid]==x){
                result = mid;
                last = mid -1;
            }
            else if(arr[mid] >= x){
                last = mid -1;
            }
            else{
                first = mid + 1;
            }
               
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];
            for(int i=0 ;i<n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long cnt = 0;
            for(int i=0; i<n-1; i++){
                long nua_tren = searchBinary_tren(arr, k-arr[i], i+1, n-1);
                long nua_duoi = searchBinary_duoi(arr, k-arr[i], i+1, n-1);
                if(nua_duoi <= n-1){
                    cnt += nua_tren - nua_duoi + 1;
                }
            }
            System.out.println(cnt);
        } 
    }
}
//4
//4 6
//1 5 7 -1
//5 6
//1 5 7 -1 5
//4 2
//1 1 1 1
//13 11
//10 12 10 15 -1 7 6 5 4 2 1 1 1
