package bai2;

public class tapChi extends taiLieu{
    private String soPhatHanh;
    private int  thangPH;
    public tapChi(){}
    public tapChi(String maTL, String tenNhaXB, int soXB, String soPhatHanh,int thangPH){
        super(maTL,tenNhaXB,soXB);
        this.soPhatHanh=soPhatHanh;
        this.thangPH=thangPH;

    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    public String toString(){
        return " Mã TL :"+getMaTL()+"Tên nhà xuất bản :"+getTenNhaXB()+"Số xuất bản "+getSoXB()+" so Phát hành : "+soPhatHanh+" Tháng Phát hành : "+thangPH;
    }
}
