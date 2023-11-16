import java.util.*;

public class j05051_sapXepBangTinhTienDien {
    static long x(String s){
        if(s.compareTo("KD") == 0) return 3;
        if(s.compareTo("NN") == 0) return 5;
        if(s.compareTo("TT") == 0) return 4;
        return 2;
    }

    static long plus(long total, long dis){
        if(dis<50) return 0;
        if(dis<=100) return Math.round(total/100.0*35);
        return total;
    }

    static class ob implements Comparable<ob> {
        private String code;
        private Long x, total, plus, sum, dis;
        private static int i = 1;
        public ob(String type, long pre, long af){
            this.code = "KH" + String.format("%02d", i++);
            this.x = x(type);
            this.dis = af - pre;
            this.total = this.dis * this.x * 550;
            this.plus = plus(this.total, this.dis);
            this.sum = this.total + this.plus;
        }

        public String toString() {
            return code + " " + this.x + " " + this.total + " " + this.plus + " " + this.sum;
        }

        @Override
        public int compareTo(ob o) {
            return o.sum.compareTo(this.sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.next(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(a);
        a.forEach(e -> System.out.println(e));
    }
}