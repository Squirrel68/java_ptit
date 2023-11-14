package j05026_danhSachGiangVienTheoBoMon;

public class GiangVien {
    private String ma, ten, nganh;
    private static int stt = 1;

    public GiangVien(String ten, String nganh) {
        this.ma = "GV" + String.format("%02d", stt++);
        this.ten = ten;
        String[] tmp = nganh.trim().split(" ");
        nganh = "";
        for (String s : tmp) {
            nganh += Character.toUpperCase(s.charAt(0));
        }
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nganh;
    }
}
