package baohiemnhantho;

public class BaoHiemHopDong extends BaoHiem{
    private String thoiGianKetThuc;
    private String sanPhamDiKem;

    public BaoHiemHopDong(){}

    public BaoHiemHopDong(String tenGoi, String thoiHan, double mucPhi, String mucDich, String cachThucDong, String thoiGianBatDau, String thoiGianKetThuc, String sanPhamDiKem) {
        super(tenGoi, thoiHan, mucPhi, mucDich, cachThucDong, thoiGianBatDau);
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.sanPhamDiKem = sanPhamDiKem;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getSanPhamDiKem() {
        return sanPhamDiKem;
    }

    public void setSanPhamDiKem(String sanPhamDiKem) {
        this.sanPhamDiKem = sanPhamDiKem;
    }

    public void input(){
        super.input();
        System.out.print("Nhap thoi gian ket thuc: ");
        thoiGianKetThuc = sc.nextLine();
        System.out.print("Sản phẩm bảo hiểm đi kèm (bao gồm: bệnh hiểm nghèo, trợ cấp nằm viện và bảo hiểm thương tật vĩnh viễn): ");
        sanPhamDiKem = sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("Thoi gian ket thuc: " + thoiGianKetThuc);
        System.out.println("San pham di kem: " + sanPhamDiKem);
    }
}

