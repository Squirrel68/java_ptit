import java.util.Scanner;

public class j03029_chuanHoaCau {
    public static String cleanParagraph(String source) {
        source = source.trim();
        source = source.replaceAll("\\s+", " ");
        source = source.replaceAll("\\s+([.!?])", "$1");
        source = source.toLowerCase();
        source = source.substring(0, 1).toUpperCase() + source.substring(1);
        if (Character.isAlphabetic(source.charAt(source.length() - 1))) {
            source += '.';
        }
        return source;
    }

    public static void solve() {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.nextLine();
            System.out.println(cleanParagraph(s));
        }
    }


    public static void main(String[] args) {
        solve();
    }
}
