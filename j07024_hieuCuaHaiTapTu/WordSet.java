package j07024_hieuCuaHaiTapTu;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> set;

    public WordSet() {
        set = new TreeSet<>();
    }
    public WordSet(String filename) throws IOException {
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNext())
            set.add(sc.next().toLowerCase());
        sc.close();
    }

    public WordSet difference(WordSet other) {
        WordSet result = new WordSet();
        result.set.addAll(set);
        result.set.removeAll(other.set);
        return result;
    }

    @Override
    public String toString() {
        String res = "";
        for (String s : set)
            res += s + " ";
        return res;
    }
}
