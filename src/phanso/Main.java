package phanso;

public class Main {
    public static void main(String[] args) {
        PhanSo ps=new PhanSo();
        ps.input();
        ps.checkPs();
        ps.rutGon();
        System.out.println("tong tu va mau: "+ps.tongPs());
        System.out.println("hieu tu va mau: "+ps.hieuPs());
        System.out.println("tich tu va mau: "+ps.tichPs());
        System.out.println("thuong tu va mau: "+ps.thuongPs());


    }
}
