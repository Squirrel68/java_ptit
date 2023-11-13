package j05012_tinhTien;

public class MatHang implements Comparable<MatHang> {
    private String id, name;
    private long quantity, price, discount, total;

    public MatHang(String id, String name, long quantity, long price, long discount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.total = quantity*price-discount;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + quantity + " " + price + " " + discount + " " + total;
    }

    @Override
    public int compareTo(MatHang o) {
        return o.total > this.total ? 1 : -1;
    }
}
