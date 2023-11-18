import java.util.*;

public class j05053_sapXepDonHang {
    static long off(String s, long total){
        if (s.charAt(s.length()-1) == '1') return total/2;
        return total*3/10;
    }

    static class ob implements Comparable<ob> {
        String code, name, stt;
        long total, sum, off;

        public ob(String name, String code, long price, long sl){
            this.name = name;
            this.code = code;
            this.stt = code.substring(1,4);
            this.total = price*sl;
            this.off = off(code, this.total);
            this.sum = this.total - this.off;
        }

        public String toString() {
            return name + " " + this.code + " " + this.stt + " " + this.off + " " + this.sum;
        }

        @Override
        public int compareTo(ob o) {
            int a = Integer.parseInt(this.stt);
            int b = Integer.parseInt(o.stt);
            return a - b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(a);
        a.forEach(e -> System.out.println(e));
    }
}