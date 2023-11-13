package j05021_sapXepTheoMaSinhVien;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, cls, email;

    public SinhVien(String id, String name, String cls, String email) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cls + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
}
