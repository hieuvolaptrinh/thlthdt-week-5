import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bai6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("Thêm phần tử tại vị trí: ");
        int a = sc.nextInt();
        System.out.print("Phần tử muốn thêm: ");
        int n = sc.nextInt();
        list.add(n);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Xóa phần tử tại vị trí: ");
        int r = sc.nextInt();
        list.remove(r);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}