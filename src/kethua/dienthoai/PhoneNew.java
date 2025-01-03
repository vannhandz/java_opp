package kethua.dienthoai;

import java.util.Scanner;

public class PhoneNew extends Phone{
    private int soLuong;
    private String idNew="DTM";
    static private int xxx=0;
    public PhoneNew() {
        xxx++;
        this.setId(String.format("%s%03d", idNew, xxx));
    }

    public PhoneNew(String tenDt, int price, String thoiGianBh, String hangXs, int soLuong,String id) {
        super(tenDt, price, thoiGianBh, hangXs,id);
        this.soLuong = soLuong;
        xxx++;
        this.setId(String.format("%s%03d", idNew, xxx));

    }
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public  void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("SoLuong: ");
        soLuong = sc.nextInt();
    }
    public void output() {

        super.output();
        System.out.println("SoLuong: " + soLuong);
        System.out.println("=======================");
    }


}
