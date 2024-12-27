package phanso;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo();
        ps1.input();
        PhanSo ps2=new PhanSo();
        ps2.input();
        PhanSo tong=ps1.cong(ps2);
        PhanSo hieu=ps1.tru(ps2);
        PhanSo nhan=ps1.nhan(ps2);
        PhanSo thuong=ps1.chia(ps1);
        System.out.print("tong 2 phan so: ");
        tong.output();
        System.out.print("tru 2 phan so: ");
        hieu.output();
        System.out.print("tich 2 phan so: ");
        nhan.output();
        System.out.print("thuong 2 phan so: ");
        thuong.output();

    }
}
