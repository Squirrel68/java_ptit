package j05018_bangDiemHocSinh;

public class HocSinh implements Comparable<HocSinh> {
    private String id, name, rank;
    private static int cnt =1;
    private double toan, tv, anh, ly, hoa, sinh, su, dia, gdcd, cn,TB;

    public HocSinh(String name, double toan, double tv, double anh, double ly, double hoa, double sinh, double su, double dia, double gdcd, double cn) {
        this.name = name;
        this.toan = toan;
        this.tv = tv;
        this.anh = anh;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
        this.cn = cn;
        this.TB = ((toan+tv)*2+anh+ly+hoa+sinh+su+dia+gdcd+cn)/12;
        this.TB = Math.round(this.TB*10)/10.0;
        this.id = String.format("HS%02d", cnt++);
        if(TB >= 9){
            this.rank = "XUAT SAC";
        } else if(TB >= 8){
            this.rank = "GIOI";
        } else if(TB >= 7){
            this.rank = "KHA";
        } else if(TB >= 5){
            this.rank = "TB";
        } else {
            this.rank = "YEU";
        }
    }

    @Override
    public String toString(){
        return id + " " + name + " " + String.format("%.1f", TB) + " " + rank;
    }

    @Override
    public int compareTo(HocSinh o){
        if(Double.compare(this.TB, o.TB) != 0){
            return Double.compare(o.TB, this.TB);
        }
        return this.id.compareTo(o.id);
    }
}
