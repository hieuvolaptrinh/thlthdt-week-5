import java.util.Scanner;

public class bai2 {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
public static void in( int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập vào phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("đảo ngược các phần tử trong mảng vừa tạo");
        reverseArray(arr);
        in(arr);
    }
}
