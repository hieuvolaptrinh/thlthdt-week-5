package bai7;

import java.util.Objects;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private float diemTB;

    public SinhVien(String maSV, String tenSV, float diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
//phải có toString để in ra


    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", tenSV='" + tenSV + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}
