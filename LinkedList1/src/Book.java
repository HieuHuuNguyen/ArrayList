import java.util.Objects;

public class Book {
    private int quantity;
    private String id;
    private String fullname;
    private String author;
    private String publisher;

    private float price;

    public Book(){

    }

    public Book(String id, int quantity, String fullname, String author, String publisher, float price) {
        this.id = id;
        this.quantity = quantity;
        this.fullname = fullname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", fullname='" + fullname + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, author,publisher, quantity, price);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(this == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Book other = (Book) obj;
        return Objects.equals(id, other.id);
    }

    public int compareTo(Book o){
        return this.id.compareTo(o.id);
    }
}
