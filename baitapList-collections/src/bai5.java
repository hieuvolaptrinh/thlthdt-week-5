import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập danh sách số nguyên cần tạo ngẫu nhiên");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random()*100); // vì Math.random() trả về số thực 0->1
            System.out.print(arr[i] + " ");
        }
    }
}
