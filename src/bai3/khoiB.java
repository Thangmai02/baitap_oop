package bai3;

public class khoiB extends  thiSinh{
    public khoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String  toString() {
        return " SBD : "+getSoBaoDanh()+" - Họ tên : "+getHoTen()+" - Địa chỉ : "+getDiaChi()+
                " - Muc ưu tiên : "+ getMucUuTien()+"Thí sinh khối A thi các môn: Toán, Hoá, Sinh";
    }
}
