import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class studentsList {
    private ArrayList<students> stdList;

    public studentsList() {
        this.stdList = new ArrayList<students>();
    }

    public studentsList(ArrayList<students> stdList) {
        this.stdList = stdList;
    }

    // 1.	Thêm sinh viên vào danh sách.
    public void addStudents(students std) {
        this.stdList.add(std);
    }

    //		2.	In danh sách sinh viên ra màn hình.
    public void showStudentsList() {
        for (students students : stdList) {
            System.out.println(students);
        }
    }

    //		3.	Kiểm tra danh sách có rỗng hay không.
    public boolean checkedStudentIsEmpty() {
        return this.stdList.isEmpty();
    }

    //		4.	Lấy ra số lượng sinh viên trong danh sách.
    public int countNumberOfStudents() {
        return this.stdList.size();
    }

    //		5.	Làm rỗng danh sách sinh viên.
    public void removeAllStudent() {
        this.stdList.removeAll(stdList);
    }

    //		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
    public boolean checkStudentIsExit(students std) {
        return this.stdList.contains(std);
    }

    //		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean deleteStudent(students std) {
        return this.stdList.remove(std);
    }

    //		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void findStudent(String fullname) {
        for (students students: stdList) {
            if(students.getFullname().indexOf(fullname)>=0) {
                System.out.println(students);
            }
        }
    }
    //		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sortStudentByMark() {
        Collections.sort(this.stdList, new Comparator<students>() {
            @Override
            public int compare(students sv1, students sv2) {
                if(sv1.getMark()<sv2.getMark()) {
                    return 1;
                }else if(sv1.getMark()>sv2.getMark()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
