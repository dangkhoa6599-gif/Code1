package PS;

/**
 *
 * @author mac
 */
public class PhanSo {
    private int Tu, Mau;
    public PhanSo(int Tu,int Mau){
        super();
        this.Mau=Mau;
        this.Tu =Tu;
    }

    public int getTu() {
        return Tu;
    }

    public void setTu(int Tu) {
        this.Tu = Tu;
    }

    public int getMau() {
        return Mau;
    }

    public void setMau(int Mau) {
        this.Mau = Mau;
    }
    public int timUSCLN(int a,int b){
        while(a!=b){
            if(a>b){
                a -=b;
            }
            else{
                b -=a;
            }
        }
        return a;
    }
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.Tu + "/" + phanSoTong.Mau);
        ....................
    }
      
    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.Tu + "/" + phanSoHieu.Mau);
    }
     
    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.Tu + "/" + phanSoTich.Mau);
    }
     
    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.Tu + "/" + phanSoThuong.Mau);
    }
     
}

