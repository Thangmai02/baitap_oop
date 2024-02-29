package bai2;

public class bao extends taiLieu{
    private String ngayPH;
    public bao(){}
    public bao(String maTL, String tenNhaXB, int soXB, String ngayPH){
        super(maTL,tenNhaXB,soXB);
        this.ngayPH=ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    public String toString(){
        return " Mã TL :"+getMaTL()+"Tên nhà xuất bản :"+getTenNhaXB()+" Ngày phát hành : "+ngayPH ;
    }
}
