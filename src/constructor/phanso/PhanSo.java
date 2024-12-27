package constructor.phanso;

public class PhanSo {

    private double tuSo;
    private double mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public PhanSo(double tuSo) {
        this.tuSo = tuSo;
        this.mauSo = 1;
    }

    public PhanSo(double tuSo, double mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }

    private double uscln(double a, double b) {
        if (b == 0) return a;
        return uscln(b, a % b);
    }

    private void rutGon() {
        double ucln= uscln(tuSo,mauSo);
        tuSo/=ucln;
        mauSo/=ucln;
        if(mauSo<0)
        {
            tuSo=-tuSo;
            mauSo=-mauSo;
        }
    }


    public void outPut()
    {
        if(mauSo==1)
            System.out.println(tuSo);
        else
        {
            System.out.println(tuSo+"/"+mauSo);
        }
    }

    public void cong(int tu)
    {
        this.tuSo += tu*this.mauSo;
        rutGon();
    }

    public PhanSo coppy()
    {
       return new PhanSo(tuSo,mauSo);

    }
}
