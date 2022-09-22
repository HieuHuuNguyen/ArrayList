public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.setT(new Integer(10));
        stringBox.setT(new String("Hello World"));

        System.out.println("Giá trị số nguyên là: " + integerBox.getT());
        System.out.println("Giá trị string là: " + stringBox.getT());
    }
}