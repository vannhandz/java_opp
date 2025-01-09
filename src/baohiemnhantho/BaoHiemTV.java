package baohiemnhantho;

import java.util.Scanner;

public class BaoHiemTV extends BaoHiem {
    private String loaiBH;
    private double thoiGianToiThieuThamGia;

    public BaoHiemTV() {}


    public BaoHiemTV(String tenGoi, String thoiHan, double mucPhi, String mucDich, String cachThucDong, String thoiGianBatDau, String loaiBH, double thoiGianToiThieuThamGia) {
        super(tenGoi, thoiHan, mucPhi, mucDich, cachThucDong, thoiGianBatDau);
        this.loaiBH = loaiBH;
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }

    static Scanner sc = new Scanner(System.in);


    public void input()
    {
        super.input();
        System.out.print("Trường hợp đóng bảo hiểm (bao gồm: Trường hợp tử kỳ -  người tham gia bảo hiểm không còn sống và Trường hợp trọn đời – bảo hiểm kéo dài cho đến hết cuộc đời): ");
        loaiBH=sc.nextLine();
        System.out.print("thoi gian toi thieu: ");
        thoiGianToiThieuThamGia=Double.parseDouble(sc.nextLine());
    }

    public void output(){
        super.output();
        System.out.println("Truong hop dong bao hiem: "+ loaiBH);
        System.out.println("Thoi gian thoi thieu: "+ thoiGianToiThieuThamGia);
    }
}
