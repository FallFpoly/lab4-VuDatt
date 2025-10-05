

package com.mycompany.lab4;

import java.util.Scanner;

public class bai1 {
    
    public String tenSp;
    public double donGia;
    public double giamGia;

    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhap giam gia: ");
        giamGia = scanner.nextDouble();
    }

    
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

        public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
    

}
