package j05010_sapXepDSMatHang;

public class MatHang implements Comparable<MatHang> {
    private String name, cls;
    private double in, out, profit;
    private static int cnt=1;
    private int id;

    public MatHang(String name, String cls, double in, double out) {
        this.id = cnt++;
        this.name = name;
        this.cls = cls;
        this.in = in;
        this.out = out;
        this.profit=out-in;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+cls+" "+String.format("%.2f", profit);
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.profit,this.profit);
    }
}
