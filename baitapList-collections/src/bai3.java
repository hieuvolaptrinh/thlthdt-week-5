import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài mảng cần tạo");
        int n = sc.nextInt();
//        int[] arr = new int[n];
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("sắp xếp các phần tử trong mảng theo thứ tự tăng dần là ");
//        Arrays.sort(arr); // cách 1
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return 1;
                else return -1;
            }
        });
        //        for (int i = 0; i < n; i++) { // cách 3
//            for (int j = i+1; j < n-1; j++) {
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

