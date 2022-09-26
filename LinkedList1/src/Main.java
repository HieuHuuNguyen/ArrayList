import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookManagement blist = new BookManagement();
        showMenu();
        int choose;
        do{
            choose = Integer.parseInt(scan.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhập id"); String id = scan.nextLine();
                    System.out.println("Nhập tên sách"); String fullname = scan.nextLine();
                    System.out.println("Nhập tên tác giả"); String author = scan.nextLine();
                    System.out.println("Nhập tên nhà xuất bản"); String publisher = scan.nextLine();
                    System.out.println("Nhập giá bán"); float price = Float.parseFloat(scan.nextLine());
                    System.out.println("Nhập số lượng"); int quantity = Integer.parseInt(scan.nextLine());
                    Book b = new Book();
                    blist.addNewBook(b);
                    break;
                case 2:
                    blist.displayBook();
                    break;
                case 3:
                    System.out.println("Trong kho trống " + blist.isThisStoreEmpty());
                    break;
                case 4:
                    System.out.println("Số sách trong kho là: " + blist.countKindOfBookInStore());
                    break;
            }
        }while ( choose != 0);
    }

    public static void showMenu(){
        System.out.println("1. Thêm sách mới: ");
        System.out.println("2. Hiển thị sách trong kho: ");
        System.out.println("3. Liệu kho có trống???");
        System.out.println("4. Đếm số sách trong kho: ");
        System.out.println("0. Thoát!!!");
    }
}