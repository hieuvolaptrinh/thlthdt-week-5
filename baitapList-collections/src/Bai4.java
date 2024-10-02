import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của n: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        int cnt[] = new int[10001];
        for (int i = 0; i < n; i++) {
            cnt[m[i]]++;
        }

        int max = -1, res = 0;
        for (int i = 0; i < 10001; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                res = i;
            }

        }
        System.out.println("Phần tử xuât hiện nhiều nhất là: " + res);

    }

}