import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n]; // khơởi tạo mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            mang[i] = scanner.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += mang[i];   // Tính tổng các phần tử của mảng
        }
        System.out.println("Tổng các phần tử trong mảng là: " + tong);
    }
}