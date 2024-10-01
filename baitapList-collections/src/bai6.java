
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai6 {
    public static void themPhanTu(ArrayList<Integer> arrList, int phanTu, int viTri) {
        if (viTri < 0 || viTri > arrList.size()) {
            System.out.println("vị trí không hợp lệ.");
            return;
        }
        arrList.add(viTri, phanTu);
    }

    public static void xoaPhanTu(ArrayList<Integer> arrList, int viTri) {
        if (viTri < 0 || viTri >= arrList.size()) {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }
        arrList.remove(viTri);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<>();
        System.out.println("nhap so phan tu ban dau cua mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + ": ");
            arrList.add(sc.nextInt());
        }
        int luaChon ;
        do {
            System.out.println("1. Them phan tu vao mang");
            System.out.println("2. Xoa phan tu khoi mang");
            System.out.println("0. Thoat");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("nhap phan tu can them: ");
                int phanTu = sc.nextInt();
                System.out.println("nhap vi tri can them: ");
                int viTri = sc.nextInt();
                themPhanTu((ArrayList<Integer>) arrList, phanTu, viTri);
                System.out.println("mang sau khi them: ");
                for ( int i=0;i<arrList.size();i++){
                    System.out.print(arrList.get(i));
                }
            }
            if(luaChon == 2){
                System.out.println("nhap vi tri can xoa: ");
                int viTri = sc.nextInt();
                xoaPhanTu((ArrayList<Integer>) arrList, viTri-1);
                System.out.println("mang sau khi xoa: ");
                for ( int i=0;i<arrList.size();i++){
                    System.out.print(arrList.get(i)+" ");
                }
            }
        }
        while (luaChon != 0);
    }
}
