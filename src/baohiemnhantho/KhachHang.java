package baohiemnhantho;

import java.util.Scanner;

public class KhachHang  {
    private String hoTen;
    private String ngaySinh;
    private String noiThuongTru;
    private String soChungMinhThu;
    private BaoHiem baoHiem;
    static Scanner sc = new Scanner(System.in);

    public KhachHang() {
    }

    public KhachHang(String hoTen, String ngaySinh, String noiThuongTru, String soChungMinhThu) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiThuongTru = noiThuongTru;
        this.soChungMinhThu = soChungMinhThu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiThuongTru() {
        return noiThuongTru;
    }

    public void setNoiThuongTru(String noiThuongTru) {
        this.noiThuongTru = noiThuongTru;
    }

    public String getSoChungMinhThu() {
        return soChungMinhThu;
    }

    public void setSoChungMinhThu(String soChungMinhThu) {
        this.soChungMinhThu = soChungMinhThu;
    }

    public BaoHiem getBaoHiem() {
        return baoHiem;
    }

    public void setBaoHiem(BaoHiem baoHiem) {
        this.baoHiem = baoHiem;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        KhachHang.sc = sc;
    }

    public void input() {
        System.out.println("======== Thong Tin Khach Hang ========");
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap noi thuong tru: ");
        noiThuongTru = sc.nextLine();
        System.out.print("Nhap so chung minh thu: ");
        soChungMinhThu = sc.nextLine();
    }


    public void output() {
        System.out.println("======== Thong Tin Khach Hang ========");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Noi thuong tru: " + noiThuongTru);
        System.out.println("So chung minh thu: " + soChungMinhThu);
        baoHiem.output();
    }
}

