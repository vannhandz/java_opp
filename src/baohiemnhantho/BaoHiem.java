package baohiemnhantho;

import java.util.Scanner;

public abstract class BaoHiem implements Comparable<BaoHiem> {
    private String tenGoi;
    private String thoiHan;
    private double mucPhi;
    private String mucDich;
    private String cachThucDong;
    private String thoiGianBatDau;

    public BaoHiem() {}
    public BaoHiem(String tenGoi, String thoiHan, double mucPhi, String mucDich, String cachThucDong, String thoiGianBatDau) {
        this.tenGoi = tenGoi;
        this.thoiHan = thoiHan;
        this.mucPhi = mucPhi;
        this.mucDich = mucDich;
        this.cachThucDong = cachThucDong;
        this.thoiGianBatDau = thoiGianBatDau;
    }

    static Scanner sc = new Scanner(System.in);



    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    public double getMucPhi() {
        return mucPhi;
    }

    public void setMucPhi(double mucPhi) {
        this.mucPhi = mucPhi;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public String getCachThucDong() {
        return cachThucDong;
    }

    public void setCachThucDong(String cachThucDong) {
        this.cachThucDong = cachThucDong;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public int compareTo(BaoHiem baoHiem) {
        return Double.compare(this.mucPhi, baoHiem.mucPhi);
    }

    public void input() {
        System.out.print("Nhap ten goi BH tu vong: ");
        tenGoi = sc.nextLine();
        System.out.print("Nhap thoi han: ");
        thoiHan = sc.nextLine();
        System.out.print("Nhap muc phi: ");
        mucPhi = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap muc dich: ");
        mucDich = sc.nextLine();
        System.out.print("Nhap cach thuc dong phi: ");
        cachThucDong = sc.nextLine();
        System.out.print("Nhap thoi gian bat dau: ");
        thoiGianBatDau = sc.nextLine();
    }

    public void output() {
        System.out.println("Ten goi BH: " + tenGoi);
        System.out.println("Thoi han: " + thoiHan);
        System.out.println("Muc phi: " + mucPhi);
        System.out.println("Muc dich: " + mucDich);
        System.out.println("Cach thuc dong phi: " + cachThucDong);
        System.out.println("Thoi gian bat dau: " + thoiGianBatDau);
    }

}
