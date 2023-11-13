package j05081_DanhSachMatHang;

public class MatHang implements Comparable<MatHang> {
    private String maMH, tenMH, donViTinh;
    private int giaMua, giaBan, loiNhuan;
    private static int cnt = 1;

    public MatHang(String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = String.format("MH%03d", cnt++);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maMH+" "+tenMH+" "+donViTinh+" "+giaMua+" "+giaBan+" "+loiNhuan;
    }

    @Override
    public int compareTo(MatHang o) {
        if (this.loiNhuan != o.loiNhuan)
            return o.loiNhuan - this.loiNhuan;
        return this.maMH.compareTo(o.maMH);
    }
}
