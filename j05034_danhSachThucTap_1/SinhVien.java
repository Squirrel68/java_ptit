package j05034_danhSachThucTap_1;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, className, email, company;
    private static int cnt=1;
    private int stt;

    public SinhVien(String id, String name, String className, String email, String company) {
        this.stt = cnt++;
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return stt+" "+id + " " + name + " " + className + " " + email + " " + company;
    }

    @Override
    public int compareTo(SinhVien o) {

        return this.id.compareTo(o.id);
    }
}
