package kethua.dienthoai;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone> {

    private String tenDt;
    private int price;
    private String thoiGianBh;
    private String hangXs;
    private String id;

    public Phone(){

    }


    public Phone(String tenDt, int price, String thoiGianBh, String hangXs, String id) {
        this.tenDt = tenDt;
        this.price = price;
        this.thoiGianBh = thoiGianBh;
        this.hangXs = hangXs;
        this.id = id;
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.price, o.price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTenDt() {
        return tenDt;
    }

    public void setTenDt(String tenDt) {
        this.tenDt = tenDt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getThoiGianBh() {
        return thoiGianBh;
    }

    public void setThoiGianBh(String thoiGianBh) {
        this.thoiGianBh = thoiGianBh;
    }

    public String getHangXs() {
        return hangXs;
    }

    public void setHangXs(String hangXs) {
        this.hangXs = hangXs;
    }


    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dien thoai: ");
        tenDt=sc.nextLine();
        System.out.print("Nhap gia: ");
        price=Integer.parseInt(sc.nextLine());
        System.out.print("ThoiGianBh: " );
        thoiGianBh=sc.nextLine();
        System.out.print("Nhap HangXs: " );
        hangXs=sc.nextLine();
    }

    public void output() {

        System.out.println("ID: "+getId());
        System.out.println("TenDt: " + tenDt);
        System.out.println("Price: " + price+"$");
        System.out.println("ThoiGianBh: " + thoiGianBh);
        System.out.println("HangXs: " + hangXs);

    }
}
