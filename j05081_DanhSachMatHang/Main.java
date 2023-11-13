package j05081_DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while (t-->0)
            a.add(new MatHang(sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()) ,Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (MatHang i:a)
            System.out.println(i);
    }
}
