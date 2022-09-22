import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arrStr = new String[] { "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy" };
        Pair<String> pairStr = minMaxSearching.Analyse(arrStr);
        System.out.println("Giá trị nhỏ nhất của màng String là " + pairStr.getFirst() + "; Lớn nhất là: "
                + pairStr.getSecond());

        Integer[] arrInt = new Integer[] { 5, -19, 40, 33, 25, -7 };
        Pair<Integer> pairInt = minMaxSearching.Analyse(arrInt);
        System.out.println("Giá trị nhỏ nhất của mảng Integer là " + pairInt.getFirst() + "; Lớn nhất là: "
                + pairInt.getSecond());

        Double[] arrDouble = new Double[]{1.1, 2.3, 0.6, 6.9, 5.5};
        Pair<Double> pairDouble = minMaxSearching.Analyse(arrDouble);
        System.out.println("Giá trị nhỏ nhất của mảng Double là " + pairDouble.getFirst() + "; Lớn nhất là: "
                + pairDouble.getSecond());

        Character[] arrChar = new Character[]{'a', 'c', 'd', 'z', 'h'};
        Pair<Character> pairChar = minMaxSearching.Analyse(arrChar);
        System.out.println("Giá trị nhỏ nhất của mảng Char là " + pairChar.getFirst() + "; Lớn nhất là: "
                + pairChar.getSecond());
    }
}