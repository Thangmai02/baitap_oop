package bai2;

public class taiLieu {
    private String maTL;
    private String tenNhaXB;
    private  int soXB;
    public taiLieu(){}
    public taiLieu(String maTL,String tenNhaXB,int soXB){
        this.maTL=maTL;
        this.tenNhaXB=tenNhaXB;
        this.soXB=soXB;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoXB() {
        return soXB;
    }

    public void setSoXB(int soXB) {
        this.soXB = soXB;
    }
    public String toString(){
        return " Mã TL :"+maTL+"Tên nhà xuất bản :"+tenNhaXB+"Số xuất bản "+soXB;
    }
}
