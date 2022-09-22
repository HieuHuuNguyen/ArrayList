import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        studentsList stdList = new studentsList();
        showMenu();
        int choose;
        do{
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập mã sinh viên: "); String rollno = scan.nextLine();
                    System.out.println("Nhập họ và tên: "); String fullname = scan.nextLine();
                    System.out.println("Nhập năm sinh: "); int DOB = Integer.parseInt(scan.nextLine());
                    System.out.println("Nhập điểm trung bình: "); float mark = Float.parseFloat(scan.nextLine());
                    students student = new students(rollno, fullname, DOB, mark);
                    stdList.addStudents(student);
                    break;
                case 2:
                    stdList.showStudentsList();
                    break;
                case 3:
                    System.out.println("Danh sách rỗng: "+ stdList.checkedStudentIsEmpty());
                    break;
                case 4:
                    System.out.println("Số lượng hiện tại: "+ stdList.countNumberOfStudents());
                    break;
                case 5:
                    stdList.removeAllStudent();
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên: ");
                    rollno = scan.nextLine();
                    students std0 = new students(rollno); stdList.checkStudentIsExit(std0);
                    System.out.println("Kiếm tra sinh viên có trong danh sách: "+stdList.checkStudentIsExit(std0));
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên: ");
                    rollno = scan.nextLine();
                    students std1 = new students(rollno); stdList.deleteStudent(std1);
                    System.out.println("Xóa sinh viên trong danh sách: "+stdList.deleteStudent(std1));
                    break;
                case 8:
                    System.out.println("Nhập họ và tên: ");
                    fullname = scan.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    stdList.findStudent(fullname);
                    break;
                case 9:
                    stdList.sortStudentByMark();
                    stdList.showStudentsList();
                    break;
            }
        } while (choose != 0);
    }

    public static void showMenu(){
        System.out.println("1. Thêm sinh viên vào danh sách: ");
        System.out.println("2. In danh sách sinh viên: ");
        System.out.println("3. Kiểm tra danh sách có rỗng hay không");
        System.out.println("4. Lấy ra số lượng sinh viên có trong danh sách");
        System.out.println("5. Làm rỗng danh sách sinh viên");
        System.out.println("6. Kiểm tra sinh viên có tồn tại không");
        System.out.println("7. Xóa sinh viên ra khỏi danh sách");
        System.out.println("8. Tìm kiếm sinh viên theo tên");
        System.out.println("9. Sắp xếp sinh viên theo điểm");
        System.out.println("0. Thoát!!!");
    }
}