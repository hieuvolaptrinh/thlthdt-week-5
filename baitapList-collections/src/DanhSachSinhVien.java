import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {

    private ArrayList<SinhVien> dsSV;

    public DanhSachSinhVien(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public DanhSachSinhVien() {
        this.dsSV = new ArrayList<>();
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    //    thêm sinh viên
    public void themSinhVien(SinhVien sv) {
        this.dsSV.add(sv);
    }

    //    xóa Sinh Viên
    public void xoaSinhVien(String maSV) {
        boolean check = false;
        for (SinhVien sv : dsSV) {
            if (sv.getMaSV().equals(maSV)) {
                check = true;
                dsSV.remove(sv);
                break;
            }
        }
        if(check==false)
            System.out.println("không có sinh viên cần xóa");
    }

    //    tìm kiếm sinh viên theo mã
    public void timSinhVien(String maSV) {
        boolean check = false;
        for (SinhVien sv : dsSV) {
            if (sv.getMaSV().equals(maSV)) {
                check = true;
                System.out.println(sv.toString());
            }
        }
        if(check==false)
            System.out.println("không có tìm thấy sinh viên bạn cần tìm");
    }

    //    sắp xếp sinh viên theo điểm
    public void sapXepSinhVien() {
        Collections.sort(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTenSV().compareTo(o2.getTenSV());
//                if (o1.getDiemTB() > o2.getDiemTB()) {
//                    return 1;
//                } else if (o1.getDiemTB() < o2.getDiemTB()) {
//                    return -1;
//                } else {
//                    // Nếu điểm bằng nhau, so sánh theo tên
//                    return o1.getTenSV().compareTo(o2.getTenSV());
//                }
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
