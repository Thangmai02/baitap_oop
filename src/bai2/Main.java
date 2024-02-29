package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(" nhập TL : ");
//        String maTL = scanner.nextLine();
//        System.out.println(" Nhập nhà xuất ban : ");
//        String nhaXB = scanner.nextLine();
//        System.out.println(" Nhập số xuất ban : ");
//        int soXb = scanner.nextInt();
//        scanner.nextLine();
//        taiLieu taiLieu=new taiLieu(maTL,nhaXB,soXb);
//        System.out.println(taiLieu);
//        --------------------------------------------------------------------
//        System.out.println(" nhập TL : ");
//        String maTL = scanner.nextLine();
//        System.out.println(" Nhập nhà xuất ban : ");
//        String nhaXB = scanner.nextLine();
//        System.out.println(" Nhập số xuất ban : ");
//        int soXb = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println(" Nhập tên tác giả : ");
//        String tenTg = scanner.nextLine();
//        System.out.println(" Nhập số trang : ");
//        int soTrang = scanner.nextInt();
//        scanner.nextLine();
//        sach sach=new sach(maTL,nhaXB,soXb,tenTg,soTrang);
//        System.out.println(sach);
//        ---------------------------------------------------------------------------
//        System.out.println(" nhập TL : ");
//        String maTL = scanner.nextLine();
//        System.out.println(" Nhập nhà xuất ban : ");
//        String nhaXB = scanner.nextLine();
//        System.out.println(" Nhập số xuất ban : ");
//        int soXb = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println(" Nhập số phat hành : ");
//        String soPH = scanner.nextLine();
//        System.out.println(" Nhập tháng phát hành : ");
//        int ThangPH = scanner.nextInt();
//        scanner.nextLine();
//        tapChi tapChi=new tapChi(maTL,nhaXB,soXb,soPH,ThangPH);
//        System.out.println(tapChi);
//        ---------------------------------------------------------------------------------
        System.out.println(" nhập TL : ");
        String maTL = scanner.nextLine();
        System.out.println(" Nhập nhà xuất ban : ");
        String nhaXB = scanner.nextLine();
        System.out.println(" Nhập số xuất ban : ");
        int soXb = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Nhập ngày phaát hành: ");
        String ngayPH = scanner.nextLine();
        bao bao=new bao(maTL,nhaXB,soXb,ngayPH);
        System.out.println(bao);
        scanner.close();
    }
}
