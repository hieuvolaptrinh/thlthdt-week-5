package bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSInhVien {

    private ArrayList<SinhVien> dsSV ;

    public DanhSachSInhVien(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public DanhSachSInhVien() {
        this.dsSV = new ArrayList<>();
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    //    thêm Sinh Viên
    public void themSinhVien(SinhVien sv) {
        dsSV.add(sv);
    }



    //    xóa Sinh Viên
    public void xoaSinhVien(String maSV) {
        for (int i = 0; i < dsSV.size(); i++) {
            if (dsSV.get(i).getMaSV().equals(maSV)) {
                dsSV.remove(i);
                break;
            }
        }
    }

//    tìm kiếm sinh viên theo mã
    public void timSinhVien( String maSV) {
        for(SinhVien sv : dsSV) {
            if(sv.getMaSV().equals(maSV)) {
                System.out.println(sv);
            }
        }
    }
//    sắp xếp sinh viên theo điểm
    public void sapXepSinhVien() {
        Collections.sort(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTB() > o2.getDiemTB()) {
                    return 1;
                } else {
                    if(o1.getDiemTB() == o2.getDiemTB()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

    //    hiển thị danh sách sinh viên
    public void hienThiDanhSach() {
        for (SinhVien sv : dsSV) {
            System.out.println(sv);
        }
    }
}
