import java.util.Scanner;

public class student {
    private String rollno, fullname, gender, email, address;
    int age;

    public student(){

    }

    public void input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập mã số sinh viên: ");
        rollno = scan.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        fullname = scan.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = scan.nextLine();
        System.out.println("Nhập email: ");
        email = scan.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = scan.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(scan.nextLine());
    }

    public void display(){
        System.out.println(toString());
    }

    public student(String rollno, String fullname, String gender, String email, String address, int age) {
        this.rollno = rollno;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno='" + rollno + '\'' +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
