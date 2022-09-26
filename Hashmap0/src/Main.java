import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, students> hashMap = new HashMap<String, students>();
        hashMap.put("1", new students("HS1","A","Hanoi", 12));
        hashMap.put("2", new students("HS2","C","Hanoi", 13));
        hashMap.put("3", new students("HS3", "D", "Hanoi",14));
        show(hashMap);
    }

    public static void show(Map<String, students> map){
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key + " " + map.get(key));
        }
    }
}