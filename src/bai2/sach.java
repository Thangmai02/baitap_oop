package bai2;

public class sach extends taiLieu{
    private String tenTacGia;
    private int  soTrang;
    public sach(){}

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public sach(String maTL, String tenNhaXB, int soXB, String tenTacGia,int soTrang){
        super(maTL,tenNhaXB,soXB);
        this.soTrang=soTrang;
        this.tenTacGia=tenTacGia;


    }
    public String toString(){
        return " Mã TL :"+getMaTL()+"Tên nhà xuất bản :"+getTenNhaXB()+"Số xuất bản "+getSoXB()+"Số trang : "+soTrang;
    }
}
