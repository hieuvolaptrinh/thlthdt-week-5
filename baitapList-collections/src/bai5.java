import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i =0; i<n ;i++)
        {
            int ngaunhien = rd.nextInt(1,100);
            list.add(ngaunhien);
        }
        System.out.println(list);
    }
}
