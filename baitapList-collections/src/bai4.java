import java.util.Scanner;

public class bai4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] M = new int[n];
        int i;
        for( i=0; i<n; i++)
        {
            System.out.print("M[" +i +"]= ");
            M[i] = sc.nextInt();
        }
        System.out.println("Mảng vửa tạo ra là ");
        for( i=0;i<n;i++)
            System.out.println("M[" +i +"]= " +M[i]);
        int max=0;
        int so=0;
        for (i=0 ;i<n;i++)
        {
            int dem=0;
            for (int j=0;j<n;j++)
            {
                if(M[i]==M[j])
                    dem++;
            }
            if(dem>max){
                max=dem;
                so=M[i];
            }
        }
        System.out.println("Số xuất hiện nhiều nhất là " + so + " với " +max + " lần xuất hiện");
    }
}
