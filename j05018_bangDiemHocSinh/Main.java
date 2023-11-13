package j05018_bangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> l = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            String name = sc.nextLine();
            double toan = sc.nextDouble(), tv = sc.nextDouble(), anh = sc.nextDouble(), ly = sc.nextDouble(), hoa = sc.nextDouble(), sinh = sc.nextDouble(), su = sc.nextDouble(), dia = sc.nextDouble(), gdcd = sc.nextDouble(), cn = sc.nextDouble();
            HocSinh hs = new HocSinh(name, toan, tv, anh, ly, hoa, sinh, su, dia, gdcd, cn);
            l.add(hs);
        }
        Collections.sort(l);
        for(HocSinh i : l){
            System.out.println(i);
        }
    }
}
