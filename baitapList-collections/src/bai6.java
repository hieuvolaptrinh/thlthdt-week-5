import java.util.ArrayList;
import java.util.Scanner;

public class bai6 {
    public static void in(ArrayList<Integer> ds) {
        System.out.println("Danh sách các phần tử: ");
        for (int i : ds)
            System.out.print(i + " ");
    }

    public static void them(int vitri, int giatri, ArrayList<Integer> ds) {
        ds.add(vitri, giatri);
    }

    public static void xoa(int vitri, ArrayList<Integer> ds) {
        ds.remove(vitri);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + " ");
            int x = sc.nextInt();
            ds.add(x);
        }
        in(ds);
        int vitri;
        do {
            System.out.println("\nNhập vị trí cần thêm: ");
            vitri = sc.nextInt();
            if (vitri < 0 || vitri > n)
                System.out.print("Vị trí không hợp lệ! Nhập lại ");
        }
        while (vitri <0 || vitri > n);
        System.out.println("Nhập giá trị cần thêm: ");
        int giatri = sc.nextInt();
        them(vitri, giatri, ds);
        in(ds);
        do {
            System.out.println("\nNhập vị trí cần xóa: ");
            vitri = sc.nextInt();
            if (vitri < 0 || vitri > n)
                System.out.print("Vị trí không hợp lệ! Nhập lại ");
        }
        while (vitri <0 || vitri > n);
        xoa(vitri, ds);
        in(ds);
    }
}
