package kethua.dienthoai;

import java.util.Scanner;


public class PhoneOld extends Phone {
    private int tinhTrangPin;
    private String detail;
    private String idOld = "DTC";
    private static int xxx = 0;
    public PhoneOld() {
        xxx++;
        this.setId(String.format("%s%03d", idOld, xxx));
    }

    public PhoneOld(String tenDt, int price, String thoiGianBh, String hangXs, String detail, int tinhTrangPin, String id) {
        super(tenDt, price, thoiGianBh, hangXs,id);
        this.detail = detail;
        this.tinhTrangPin = tinhTrangPin;
        xxx++;
        this.setId(String.format("%s%03d", idOld, xxx));

    }

    public int getTinhTrangPin() {
        return tinhTrangPin;
    }

    public void setTinhTrangPin(int tinhTrangPin) {
        this.tinhTrangPin = tinhTrangPin;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Tinh trang pin: ");
        tinhTrangPin = Integer.parseInt(sc.next());
        System.out.print("Tinh trang: ");
        detail = sc.next();
    }

    public void output() {
        super.output();
        System.out.println("Tinh trang pin: " + tinhTrangPin);
        System.out.println("Mo ta: " + detail);
        System.out.println("=======================");

    }
}
