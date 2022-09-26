import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("book1");
        list.add("book2");
        list.add("book3");
        System.out.println(list);

        //c1
        LinkedList<String> lk1 = new LinkedList<>(list);
        System.out.println(lk1);

        //c2
        LinkedList<String> lk2 = new LinkedList<>();
        for(String arr : list){
            lk2.add(arr);
        }
        System.out.println(lk2);

        //c3
        LinkedList<String> lk3 = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(lk3);
    }
}