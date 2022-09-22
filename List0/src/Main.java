import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Viết chương trình tìm tất cả các số nguyên tố từ 1 khoảng nhập trước
//Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
public class Main {
    public static void main(String[] args) {
        int min, max;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gia tri min");
        min = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap gia tri max");
        max = Integer.parseInt(scan.nextLine());
        List<Integer> list = new ArrayList<Integer>();
        for(int i = min; i<max; i++){
            if(isPrimeNumber(i)) {
                list.add(i);
            }
        }
        showList(list);
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showList(List<Integer> list){
        if(list != null && !list.isEmpty()){
            int size = list.size();
            for (int i=0; i<size-1;i++){
                System.out.print(list.get(i)+", ");
            }
            System.out.print(list.get(size-1));
        }
    }
}