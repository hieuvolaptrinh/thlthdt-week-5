import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
