package com.mycompany.lab4;

public class bai3 {
    private String tenSp;
    private double donGia;
    private double giamGia;

    
    public bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    
    public bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

   
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
        System.out.println("----------------------------");
    }
}
