import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07022_loaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        // loai bo so nguyen ra khoi file va sap xep theo thu tu tu dien
        while(sc.hasNext()){
            String[] s = sc.nextLine().trim().split("\\s+");
            for (String i:s) {
                if (i.length()>9 || i.matches("\\d+") == false)
                    a.add(i);
            }
        }
        Collections.sort(a);
        for (String i:a) {
            System.out.print(i+" ");
        }
    }
}
