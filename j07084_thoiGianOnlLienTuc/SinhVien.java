package j07084_thoiGianOnlLienTuc;

public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private String start, end;
    private int time;

    public SinhVien(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
        String[] s1 = start.split(" ");
        String[] s2 = end.split(" ");
        String ngay1 = s1[0], ngay2 = s2[0], gio1 = s1[1], gio2 = s2[1];
        String[] n1 = ngay1.split("/");
        String[] n2 = ngay2.split("/");
        String[] g1 = gio1.split(":");
        String[] g2 = gio2.split(":");
        int namOnl = Integer.parseInt(n2[2]) - Integer.parseInt(n1[2]),
        thangOnl = Integer.parseInt(n2[1]) - Integer.parseInt(n1[1]),
        ngayOnl = Integer.parseInt(n2[0]) - Integer.parseInt(n1[0]),
        gioOnl = Integer.parseInt(g2[0]) - Integer.parseInt(g1[0]),
        phutOnl = Integer.parseInt(g2[1]) - Integer.parseInt(g1[1]);
        if (phutOnl < 0) {
            phutOnl += 60;
            gioOnl--;
        }
        if (gioOnl < 0) {
            gioOnl += 24;
            ngayOnl--;
        }
        if (ngayOnl < 0) {
            ngayOnl += 30;
            thangOnl--;
        }
        if (thangOnl < 0) {
            thangOnl += 12;
            namOnl--;
        }
        this.time = namOnl * 365 * 24 * 60 + thangOnl * 30 * 24 * 60 + ngayOnl * 24 * 60 + gioOnl * 60 + phutOnl;
    }

    @Override
    public String toString() {
        return name + " " + time;
    }

    @Override
    public int compareTo(SinhVien o) {
        return o.time - this.time;
    }
}
