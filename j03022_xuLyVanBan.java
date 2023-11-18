import java.util.ArrayList;
import java.util.Scanner;

public class j03022_xuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            String tmp = sc.nextLine();
            if (tmp.equals("")) break;
            s += tmp;
        }
//        System.out.println(s);
        ArrayList<String> arr = new ArrayList<>();
        String[] sentence = s.trim().split("[.!?]");
        for (String string : sentence) {
            if (string.length()==0) continue;
            String[] word = string.trim().split("\\s+");
            String res = "";
            for (int i=0; i<word.length; ++i)
                if (i==0) res += word[i].substring(0,1).toUpperCase()+word[i].substring(1).toLowerCase()+" ";
                else res += word[i].toLowerCase()+" ";
            arr.add(res.trim());
        }
        for (String i: arr)
            System.out.println(i);
    }
}