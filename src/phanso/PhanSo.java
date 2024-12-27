package phanso;

import java.util.Scanner;

public class PhanSo {
    private double tu;
    private double mau;

    public PhanSo() {
    }

    public PhanSo(double tu, double mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public double getTu() {
        return tu;
    }

    public void setTu(double tu) {
        this.tu = tu;
    }

    public double getMau() {
        return mau;
    }

    public void setMau(double mau) {
        this.mau = mau;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap tu so: ");
        tu = sc.nextDouble();
        System.out.print("nhap mau so: ");
        do {
            mau = sc.nextDouble();
            if (mau < 0) {
                System.out.println("mau so < 0! , nhap lại: ");
            }
        } while (mau < 0);
    }

    public void output() {
        rutGon();
    }

    private double uscln(double a, double b) {
        if (b == 0) return a;
        return uscln(b, a % b);
    }

    public void rutGon() {
        double ucln = uscln(tu, mau);
        tu /= ucln;
        mau /= ucln;
        System.out.println(mau > 1 ? tu + "/" + mau : tu / mau);
    }

    public PhanSo cong(PhanSo ps) {
        PhanSo cong = new PhanSo();
        cong.tu = this.tu * ps.mau + this.mau * ps.tu;
        cong.mau = this.mau * ps.mau;
        return cong;
    }   

    public PhanSo tru(PhanSo ps) {
        PhanSo tru = new PhanSo();
        tru.tu = this.tu * ps.mau - this.mau * ps.tu;
        tru.mau = this.mau * ps.mau;
        return tru;
    }

    public PhanSo nhan(PhanSo ps) {
        PhanSo nhan = new PhanSo();
        nhan.tu = this.tu * ps.tu;
        nhan.mau = this.mau * ps.mau;
        return nhan;
    }

    public PhanSo chia(PhanSo ps) {
        PhanSo chia = new PhanSo();
        chia.tu = this.tu * ps.mau;
        chia.mau = this.mau * ps.tu;
        return chia;
    }


}
