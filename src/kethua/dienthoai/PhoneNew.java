package kethua.dienthoai;

import java.time.LocalDate;
import java.util.Scanner;

public class PhoneNew extends Phone{
    private int soLuong;
    private String id="DTM";
    static private int xxx=0;

    public PhoneNew() {
        xxx++;
    }

    public PhoneNew(String tenDt, int price, String thoiGianBh, String hangXs, int soLuong) {
        super(tenDt, price, thoiGianBh, hangXs);
        this.soLuong = soLuong;
        this.id = id;
        xxx++;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getId() {
        return  String.format("%s%03d", id, xxx);
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    private static int getXxx() {
        return xxx;
    }

    private static void setXxx(int xxx) {
        PhoneNew.xxx = xxx;
    }


    public  void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("SoLuong: ");
        soLuong = sc.nextInt();
    }
    public void output() {

        System.out.println("Id: "+getId());
        super.output();
        System.out.println("SoLuong: " + soLuong);

    }
}
