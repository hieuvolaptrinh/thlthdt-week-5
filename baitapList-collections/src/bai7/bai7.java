package bai7;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSInhVien ds = new DanhSachSInhVien();
        int luaChon;
        do {
            System.out.println("1. them sinh vien");
            System.out.println("2. xoa sinh vien theo ma sinh vien");
            System.out.println("3. tim kiem sinh vien theo mã sinh viên");
            System.out.println("4. hiển thị danh sách sinh viên ");
            System.out.println("5. hien thi danh sach sinh vien đã sắp xếp theo điểm");
            System.out.println("0. thoat");
            luaChon = sc.nextInt();
            if(luaChon == 1) {
                sc.nextLine();
                System.out.println("Nhap ma sinh vien: ");
                String maSV = sc.nextLine();
                System.out.println("Nhap ten sinh vien: ");
                String tenSV = sc.nextLine();
                System.out.println("Nhap diem trung binh: ");
                float diemTB = sc.nextFloat();
                SinhVien sv=new SinhVien (maSV, tenSV, diemTB);
                ds.themSinhVien(sv);
            }
            if(luaChon==2){
                sc.nextLine();
                System.out.println("nhập mã sinh viền cần xóa ");
                String maSV = sc.nextLine();
                ds.xoaSinhVien(maSV);

            }
            if (luaChon == 3) {
                sc.nextLine();
                System.out.println("nhập mã sinh viên cần tìm kiếm ");
                String maSV = sc.nextLine();
                ds.timSinhVien(maSV);

            }
            if (luaChon == 4) {

                ds.hienThiDanhSach();
            }
            if (luaChon == 5) {
                ds.sapXepSinhVien();
                ds.hienThiDanhSach();
            }
        } while (luaChon != 0);
    }

}
