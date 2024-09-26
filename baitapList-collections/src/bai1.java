import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài mảng số nguyên ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập vào phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();

        }
        System.out.println("mảng vừa nhập là ");
        int tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            tong += arr[i];
        }
        System.out.println("\nTổng các phần tử trong mảng là " + tong);
    }
}
