package j05049_lietKeNhapXuatHangTheoNhom;

public class MaHang implements Comparable<MaHang> {
    private String maHang;
    private long soLuongNhap;

    public MaHang(String maHang, long soLuongNhap) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
    }

    public long getSLXuat() {
        Long res = this.soLuongNhap;
        if (this.maHang.charAt(0)=='A') return Math.round(res*0.6);
        else if (this.maHang.charAt(0)=='B') return Math.round(res*0.7);
        return res;
    }

    public long getDonGia() {
        int d = this.maHang.length();
        if (this.maHang.charAt(d-1)=='Y') return 110000;
        else if (this.maHang.charAt(d-1)=='N') return 135000;
        return 0;
    }

    public String getMaHang() {
        return maHang;
    }

    public long getTien() {
        return this.getSLXuat() * this.getDonGia();
    }
    public long getThue() {
        long res = this.getTien();
        int d = this.maHang.length();
        if (this.maHang.charAt(0)=='A' && this.maHang.charAt(d-1)=='Y')
            return Math.round(res*0.08);
        else if (this.maHang.charAt(0)=='A' && this.maHang.charAt(d-1)=='N')
            return Math.round(res*0.11);
        else if (this.maHang.charAt(0)=='B' && this.maHang.charAt(d-1)=='Y')
            return Math.round(res*0.17);
        else if (this.maHang.charAt(0)=='B' && this.maHang.charAt(d-1)=='N')
            return Math.round(res*0.22);
        return Math.round(res);
    }

    @Override
    public String toString() {
        return maHang+" "+soLuongNhap+" "+getSLXuat()+" "+getDonGia()+" "+getTien()+" "+getThue();
    }


    @Override
    public int compareTo(MaHang o) {
        return Long.compare(o.getThue(), this.getThue());
    }
}
