import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class j07004_soKhacNhauTrongFile_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] f = new int[1005];
        while(sc.hasNextInt()){
            ++f[sc.nextInt()];
        }
        for(int i=0; i<=1000; ++i)
            if(f[i]>0)
                System.out.println(i+" "+f[i]);
    }
}
