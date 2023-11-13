import java.util.Scanner;

public class j03017_loaiBo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine();
            int count = 0;
            while (a.contains("100")) {
                int l1 = a.length();
                a = a.replaceFirst("100", "");
                int l2 = a.length();
                count+=(l1-l2);
            }
            System.out.println(count);
        }
    }
}
