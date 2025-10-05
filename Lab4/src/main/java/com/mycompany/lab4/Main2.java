
package com.mycompany.lab4;



public class Main2 {
    public static void main(String[] args) {
        
        bai2 sp1 = new bai2();
        bai2 sp2 = new bai2();

        
        System.out.println("Nhap thong tin san pham 1:");
        sp1.nhap();

        System.out.println("Nhap thong tin san pham 2:");
        sp2.nhap();

        
        System.out.println("\nThong tin san pham 1:");
        sp1.xuat();

        System.out.println("Thong tin san pham 2:");
        sp2.xuat();
    }
}

