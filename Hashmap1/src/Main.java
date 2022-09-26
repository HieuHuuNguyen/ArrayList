import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, student> studentList = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập số sinh viên cần thêm: ");
        int n = Integer.parseInt(scan.nextLine());
        for(int i=0;i<n;i++){
            student std = new  student();
            std.input();

            studentList.put(std.getRollno(), std);
        }

        for (Map.Entry<String, student> entry : studentList.entrySet()){
            String key = entry.getKey();
            student std = entry.getValue();
            System.out.println("Key " + key);
            std.display();
        }

        System.out.println("Nhập mã sinh viên cần tìm kiếm: ");
        String rollno = scan.nextLine();

        student std = studentList.get(rollno);
        if(std != null){
            std.display();
        } else {
            System.out.println("Không tìm thấy sinh viên "+ rollno);
        }


    }
}