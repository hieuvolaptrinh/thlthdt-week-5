import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài mảng cần tạo");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("số lần xuất hiện của các phần tử là");
        int max = 0;
        int giaTriMax =0;
        for (int i = 0; i < n; i++) {
            int dem = 1;
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j])
                        dem++;
                }
                System.out.println(arr[i] + " xuat hien : " + dem);
                if (dem > max) {
                    max = dem;
                    giaTriMax = arr[i];
                }
            }
        }
        System.out.println("phần tử xuất hiện nhiều nhất là " + giaTriMax + " với " +max + " lần xuất hiện");

//       phần tử nào xuất hiện nhiều nhất code đơn giản

//        int maxx=0;
//        int giTriMaxx=0;
//        for ( int i=0 ;i<n;i++){
//            int dem=0;
//            for (int j=0;j<n;j++){
//                if(arr[i]==arr[j])
//                    dem++;
//            }
//            if(dem>maxx){
//                maxx=dem;
//                giTriMaxx=arr[i];
//            }
//        }
//        System.out.println("phần tử xuất hiện nhiều nhất là " + giTriMaxx + " với " +maxx + " lần xuất hiện");
    }
}
