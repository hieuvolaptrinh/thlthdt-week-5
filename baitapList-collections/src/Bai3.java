import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            mang[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mang[j] > mang[j + 1]) {
                    int temp = mang[j]; // Hoán đổi hai phần tử
                    mang[j] = mang[j + 1];
                    mang[j + 1] = temp;
                }// Sắp xếp mảng theo thứ tự tăng dần
            }
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần:");  // In mảng sau khi sắp xếp
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}