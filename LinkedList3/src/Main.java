import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> llList = new LinkedList<>();
        llList.add(new Person("a", "hn", 20));
        llList.add(new Person("c", "nd", 20));
        llList.add(new Person("b", "hn", 22));
        llList.add(new Person("d", "bn", 19));
        llList.add(new Person("a", "hn", 24));
        llList.add(new Person("a", "hn", 22));
        //c1 sắp xếp theo họ tên
        //llList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        //llList.forEach(person -> System.out.println(person.toString()));
        //c2
        llList.sort(Comparator.comparing(o ->((Person)o).getName()).thenComparing(o -> ((Person)o).getAge()));
        llList.forEach(person -> System.out.println(person.toString()));
    }
}