package j05010_sapXepDSMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> l =new ArrayList<>();
        while (n-->0){
            sc.nextLine();
            String name = sc.nextLine(), cls=sc.nextLine();
            double in =sc.nextDouble(), out = sc.nextDouble();
            l.add(new MatHang(name,cls,in,out));
        }
        Collections.sort(l);
        for(MatHang i:l) {
            System.out.println(i);
        }
    }
}
