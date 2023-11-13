package j05023_lietKeSinhVienTheoKhoa;

public class SinhVien {
    private String id, name, cls, mail;

    public SinhVien(String id, String name, String cls, String mail) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public String getCls() {
        return cls;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+cls+" "+mail;
    }
}
