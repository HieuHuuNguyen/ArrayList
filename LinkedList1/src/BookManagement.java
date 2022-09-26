import java.util.LinkedList;
import java.util.List;

public class BookManagement {
    private LinkedList<Book> bList;

    public BookManagement(){
        this.bList = new LinkedList<Book>();
    }

    public BookManagement(LinkedList<Book> bList) {
        this.bList = bList;
    }

    //1. Add new books
    public void addNewBook(Book b){
        this.bList.add(b);
    }

    //2.Display books
    public void displayBook(){
        for(Book b : bList){
            System.out.println(b);
        }
    }

    //3. Is this store empty???
    public boolean isThisStoreEmpty(){
        return this.bList.isEmpty();
    }

    //4. Đếm số lượng sách quản lý
    public int countKindOfBookInStore(){
        return this.bList.size();
    }
}
