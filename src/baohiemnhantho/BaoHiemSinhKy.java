package baohiemnhantho;

public class BaoHiemSinhKy extends BaoHiem {
    private String thoiGianKetThuc;
    private String thoiGianTroCap;


    public BaoHiemSinhKy() {}

    public BaoHiemSinhKy(String tenGoi, String thoiHan, double mucPhi, String mucDich, String cachThucDong, String thoiGianBatDau, String thoiGianKetThuc, String thoiGianTroCap) {
        super(tenGoi, thoiHan, mucPhi, mucDich, cachThucDong, thoiGianBatDau);
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.thoiGianTroCap = thoiGianTroCap;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getThoiGianTroCap() {
        return thoiGianTroCap;
    }

    public void setThoiGianTroCap(String thoiGianTroCap) {
        this.thoiGianTroCap = thoiGianTroCap;
    }

    public void input(){
        super.input();
        System.out.print("Nhap thoi gian ket thuc: ");
        thoiGianKetThuc = sc.nextLine();
        System.out.print("Thời gian trợ cấp (bao gồm: trợ cấp trong khoản thời gian xác định hoặc cho đến khi mất): ");
        thoiGianTroCap = sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("Thoi gian ket thuc: " + thoiGianKetThuc);
        System.out.println("Thoi gian tro cap: " + thoiGianTroCap);
    }

}
