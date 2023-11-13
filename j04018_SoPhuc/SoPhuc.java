package j04018_SoPhuc;

public class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc cong(SoPhuc x) {
        return new SoPhuc(this.thuc + x.thuc, this.ao + x.ao);
    }

    public SoPhuc nhan(SoPhuc x) {
        return new SoPhuc(this.thuc * x.thuc - this.ao * x.ao, this.thuc * x.ao + this.ao * x.thuc);
    }

    @Override
    public String toString() {
        if(ao>=0) return thuc + " + " + ao + "i";
        else return thuc + " - " + Math.abs(ao)+"i";
    }
}
