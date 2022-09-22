import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n;

        System.out.println("Nhập vào số phần tử của mảng: ");
        n = Integer.parseInt(scan.nextLine());

        int[] arr = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i=0; i<n; i++){
            System.out.println("Nhập phần tử thứ " +i+" :");
            arr[i]=Integer.parseInt(scan.nextLine());
        }

       int choose;
       do{
           showMenu();
           choose = Integer.parseInt(scan.nextLine());
           switch (choose){
               case 1:
                   showList(arr);
                   break;
               case 2:
                   sortTangDan(arr);
                   System.out.println("Dãy số theo chiều tăng dần");
                   show(arr);
                   break;
               case 3:
                   sortGiamDan(arr);
                   System.out.println("Dãy số theo chiều giảm dần");
                   show(arr);
                   break;
               case 4:
                   break;
           }
       }while (choose !=4);

    }
    public static void showList(int[] arr){
        System.out.println("Dãy số vừa nhập là: ");
        show(arr);
    }

    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }System.out.println(" ");
    }
    public static void sortTangDan(int[] arr){
        int temp = arr[0];
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void sortGiamDan(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    static void showMenu(){
        System.out.println("1. In dãy số: ");
        System.out.println("2. Sắp xếp theo thứ tự tăng dần: ");
        System.out.println("3. Sắp xếp theo thứ tự giảm dần: ");
        System.out.println("4. Thoát");
    }
}