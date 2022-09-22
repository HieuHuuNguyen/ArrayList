//Viết chương trình phân tích số nguyên n thành các thừa số nguyên tố trong java. Ví dụ: 100 = 2x2x5x5.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên tố n: ");
        n = Integer.parseInt(scan.nextLine());
        List<Integer> listInteger = phanTichSoNguyen(n);
        System.out.printf("Kết quả: %d = ", n);
        int size = listInteger.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listInteger.get(i) + " x ");
        }
        System.out.print(listInteger.get(size - 1));
    }

    public static List<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        // phân tích
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        // nếu listNumbers trống thì add n vào listNumbers
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
}
