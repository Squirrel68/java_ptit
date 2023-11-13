package j07014_hopVaGiaoCuaHaiFileVanBan;

import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private Set<String> set;

    public WordSet() {
        set = new TreeSet<>();
    }

    public WordSet(String filename) throws IOException{
        Scanner sc = new Scanner(new File(filename));
        set = new TreeSet<>();
        while (sc.hasNext())
            set.add(sc.next().toLowerCase());
        sc.close();
    }

    public WordSet union(WordSet other) {
        WordSet res = new WordSet();
        res.set.addAll(other.set);
        res.set.addAll(this.set);
        return res;
    }

    public WordSet intersection(WordSet other) {
        WordSet res = new WordSet();
        res.set.addAll(this.set);
        res.set.retainAll(other.set);
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (String i : set)
            res += i + " ";
        return res;
    }
}

public class j07014_hopVaGiaoCuaHaiFileVanBan {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
