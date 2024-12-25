package khoangcach;

public class Main {
    public static void main(String[] args) {
        KhoangCach kc1 = new KhoangCach();
        KhoangCach kc2 = new KhoangCach();
        System.out.println("nhap toa do 1");
        kc1.input();
        System.out.println("nhap toa do 2");
        kc2.input();
        System.out.println("toa do diem:"+kc2.tinh(kc1));


    }
}
