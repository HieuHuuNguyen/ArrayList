//Viết một function nhận vào 2 head của hai sorted Singly linked list. Viết một function merge hai linked list và return
// head của sorted linked list đã merge.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll1.addFirst(0);
        ll1.add(2);
        ll1.add(8);
        ll1.add(4);
        ll1.add(6);
        ll1.addLast(10);
        ll2.addFirst(1);
        ll2.add(3);
        ll2.add(9);
        ll2.add(7);
        ll2.add(5);
        ll2.addLast(11);
        //cách 1 tạo 1 list mới
        //LinkedList<Integer> merge = new LinkedList<>();
        //merge.addAll(ll1);
        //merge.addAll(ll2);
        //merge.sort(Comparator.comparingInt(o -> o));
        //System.out.println("Merge list" +merge);

        //cách 2: Sử dụng hàm Iterator
        //Iterator i = ll1.iterator();
        //while (i.hasNext()){
        //    ll2.add((int)i.next());
        //}
        //ll2.sort(Comparator.comparingInt(o -> o));
        //System.out.println(ll2);

        //cách 3: Sử dụng loop
        LinkedList<Integer> merge = new LinkedList<>();
            for(int i=0; i < ll1.size(); i++){
                merge.add(ll1.get(i));
            }

            for (int i=0; i < ll2.size(); i++){
                merge.add(ll2.get(i));
            }

            merge.sort(((o1, o2) -> o1 - o2));
        System.out.println(merge);

    }
}