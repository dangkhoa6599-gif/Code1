package PS;
 
public class TestPhanSo {
     
    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo(5,3);    // tạo phân số có tử = 16 và mẫu = 4
        PhanSo phanSo2=new PhanSo(3,8); // tạo phân số có tử = 4 và mẫu = 8
         
        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
     
}