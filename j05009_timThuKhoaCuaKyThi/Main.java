package j05009_timThuKhoaCuaKyThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> l = new ArrayList<>();
        while (t-- >0){
            sc.nextLine();
            String name = sc.nextLine(), birth = sc.nextLine();
            double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3= sc.nextDouble();
            l.add(new ThiSinh(name, birth,d1,d2,d3));
        }
        Collections.sort(l);
        double maxSum = l.get(0).getSumD();
        for (ThiSinh i : l){
            if (i.getSumD()==maxSum) System.out.println(i);
        }

    }
}
