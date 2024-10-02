import java.util.Scanner;

public class Bai2 {
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
        System.out.println("Mảng sau khi đảo ngược:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(mang[i] + " ");// Đảo ngược mảng
        }
    }
}
