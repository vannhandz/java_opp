package ovl;



public class HocVien {
    public void a() {
        System.out.println("a cha");
    }

    void b() {
        System.out.println("b cha");
    }

    private void c() {
        System.out.println("c cha");
    }

    public void d() {
        System.out.println("d cha");
    }

    public byte e() {
        System.out.println("e cha");
        return 1;
    }
    public void g() {
    }

    public static void h() {
    }

    public static void i(int a, int b) {
        System.out.println(a + " " + b);
    }

    public void j(int b, int c) {
        System.out.println(b + "" + c);
    }
}