import java.util.*;
import java.io.*;

public class j07016_soNguyenToTrongFileNhiPhan {
    public static boolean check(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in")),
                        sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        for(int i : b)
            a.add(i);
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(int i : a){
            if(check(i)){
                if(m.containsKey(i))
                    m.put(i, m.get(i)+1);
                else
                    m.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : m.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}