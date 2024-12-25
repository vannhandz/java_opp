package phanso;

import java.util.Scanner;

public class PhanSo {
    double tu;
    double mau;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap tu so: ");
        tu=sc.nextDouble();
        System.out.print("nhap mau so: ");
        do{
            mau=sc.nextDouble();
            if(mau<0){
                System.out.println("mau so < 0! , nhap lại: ");
            }
        }while(mau<0);
    }

    public double uscln(double a,double b) {
        double ucln=0;
        for (double i = a; i>=1; i--) {
            if(a%i==0 && b%i==0) {
                ucln=i;
                break;
            }
        }
        return ucln;
    }
    //
    public void rutGon() {
        double ucln= uscln(tu,mau);
        tu/=ucln;
        mau/=ucln;
        if(mau<0) {
            tu=-tu;
            mau=-mau;
        }
        System.out.println(tu < mau ? "phan so sau rut gon: "+tu + "/" + mau : "phan so sau rut gon: "+tu/ mau);
    }

    public double tongPs(){
        return tu+mau;
    }
    public double hieuPs(){
        return tu-mau;
    }
    public double tichPs(){
        return tu*mau;
    }
    public double thuongPs(){
        return tu/mau;
    }

    public void checkPs(){
        if(tu==0&&mau==0) {
            System.out.println("phan so : 1");
        }else if( tichPs() > 0 || tu==0){
            System.out.println("phan so duong");
        }else
        {
            System.out.println("phan so am");
        }
    }



}
