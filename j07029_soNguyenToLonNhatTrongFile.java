import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j07029_soNguyenToLonNhatTrongFile {
    static int[] f = new int[1000001];

    public static void era() {
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for (int i = 2; i <= 1000; i++)
            if (f[i] == 1)
                for (int j = i * i; j <= 1000000; j += i)
                    f[j] = 0;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        era();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[1000001];
        for (Integer i : l)
            a[i] += f[i];
        int p = 0;
        for (int i = 1000000; i >= 2; i--) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
                p++;
                if (p == 10)
                    break;
            }
        }
        ois.close();
    }
}
