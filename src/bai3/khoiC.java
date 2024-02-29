package bai3;

public class khoiC extends thiSinh {
    public khoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String thi() {
        return " SBD : "+getSoBaoDanh()+" - Họ tên : "+getHoTen()+" - Địa chỉ : "+getDiaChi()+
                " - Muc ưu tiên : "+ getMucUuTien()+"Thí sinh khối A thi các môn: Văn, Sử, Địa";
    }
}
