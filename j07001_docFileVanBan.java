import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class j07001_docFileVanBan {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
