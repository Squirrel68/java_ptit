package j07058_danhSachMonThi;

public class MonThi implements Comparable<MonThi> {
    private String maMH, tenMH, htThi;

    public MonThi(String maMH, String tenMH, String htThi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.htThi = htThi;
    }

    @Override
    public String toString() {
        return maMH + ' ' + tenMH + ' ' + htThi + '\n';
    }

    @Override
    public int compareTo(MonThi o) {
        return this.maMH.compareTo(o.maMH);
    }
}
