package j07071_tenVietTat;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HoTen implements Comparable<HoTen> {
    private String ten;
    private String ho;
    private String hoVaTen;
    private String vietTat;

    public HoTen(String inp)
    {
        hoVaTen = inp;
        String[] s = inp.split("\\s+");
        vietTat = "";
        for (int i = 0; i < s.length - 1; ++i)
            vietTat += String.valueOf(s[i].charAt(0)) + ".";
        ten = s[s.length - 1];
        ho = s[0];
        vietTat += String.valueOf(ten.charAt(0));
    }

    public boolean compare(String s)
    {
        if (s.length() != vietTat.length())
            return false;
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == '*')
                continue;
            if (s.charAt(i) != vietTat.charAt(i))
                return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return hoVaTen;
    }

    @Override
    public int compareTo(HoTen o)
    {
        if (!ten.equals(o.ten))
            return ten.compareTo(o.ten);
        return ho.compareTo(o.ho);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoTen> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new HoTen(sc.nextLine()));
        int t = Integer.parseInt(sc.nextLine());
        String s;
        Collections.sort(a);
        while (t-- > 0) {
            s = sc.nextLine();
            for (HoTen i : a)
                if (i.compare(s))
                    System.out.println(i);
        }
    }
}
