package constructor.phanso;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo();
        ps1.outPut();
        PhanSo ps2=new PhanSo(2);
        ps2.outPut();
        PhanSo ps3=new PhanSo(3,4);
        ps3.outPut();
        PhanSo ps4=new PhanSo(-1,2);
        ps4.outPut();
        PhanSo ps5= ps3.coppy();
        ps5.outPut();
        ps5.cong(2);
        ps5.outPut();

    }
}
