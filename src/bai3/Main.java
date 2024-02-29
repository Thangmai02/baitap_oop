package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("- Nhập SBD ");
        int soBD = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" - Ho Ten : ");
        String name = scanner.nextLine();
        System.out.println("- Địa chỉ : ");
        String diaChi = scanner.nextLine();
        System.out.println("- Mức ưu tiên : ");
        int mucUutien = scanner.nextInt();
        scanner.nextLine();
//        khoiA khoiA=new khoiA(soBD,name,diaChi,mucUutien);
//        System.out.println(khoiA);
//       khoiB khoiB= new khoiB(soBD,name,diaChi,mucUutien);
//        System.out.println(khoiB);
        khoiC khoiC=new khoiC(soBD,name,diaChi,mucUutien);
        System.out.println(khoiC);
    }
}
