package kethua.dienthoai;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.SortedMap;

public class PhoneOld extends Phone {
    private int tinhTrangPin;
    private String detail;
    private String id = "DTC";
    static private int xxx = 0;

    public PhoneOld() {
        xxx++;
    }

    public PhoneOld(String tenDt, int price, String thoiGianBh, String hangXs, String detail, int tinhTrangPin) {
        super(tenDt, price, thoiGianBh, hangXs);
        this.detail = detail;
        this.tinhTrangPin = tinhTrangPin;
        xxx++;
    }

    public String getId() {
        return String.format("%s%03d", id, xxx);
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    private static int getXxx() {
        return xxx;
    }

    private static void setXxx(int xxx) {
        PhoneOld.xxx = xxx;
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
        System.out.println("Id: "+getId());
        super.output();
        System.out.println("Tinh trang pin: " + tinhTrangPin);
        System.out.println("Mo ta: " + detail);

    }
}
