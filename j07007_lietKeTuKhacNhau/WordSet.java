package j07007_lietKeTuKhacNhau;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

//    Scanner sc = new Scanner(new File("VANBAN.in"));
//    TreeSet<String> set = new TreeSet<>();
//    String s;
//        while (sc.hasNext()) {
//        s = sc.next().toLowerCase();
//        set.add(s);
//    }
//        for (String i : set) {
//        System.out.println(i);
//    }
    public WordSet(String fileName) throws IOException {
        Scanner sc = new Scanner(new File(fileName));
        String s;
        while (sc.hasNext()) {
            s = sc.next().toLowerCase();
            this.set.add(s);
        }
    }

    @Override
    public String toString() {
        String res ="";
        for (String i:set) {
            res=res+i+"\n";
        }
        return res;
    }
}
