import java.util.*;
import java.math.*;
import java.util.Scanner;

public class j02016_boBaSoPytago {
    public static boolean bSearch(long[] a, int n, long x) {
        int l = 0;
        int r = n - 1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x)
                return true;
            else if(a[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            Arrays.sort(a);
            int fl = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(bSearch(a, n, a[i] + a[j])){
                        System.out.println("YES");
                        fl = 1;
                        break;
                    }
                }
                if(fl == 1)
                    break;
            }
            if(fl == 0){
                System.out.println("NO");
            }
        }
    }
}