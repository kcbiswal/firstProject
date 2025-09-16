package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"kanha");
        hm.put(2,"hari");
        hm.put(3,"raju");
        hm.put(4,"ajay");

        System.out.println(hm);
        String s = hm.get(2);
        System.out.println(s);

        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("kanha"));

        Set<Integer> keys = hm.keySet();
        for (int i:keys){
            System.out.println(hm.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for (Map.Entry<Integer, String> i:entries){
            System.out.println(i.getKey() + ": "+ i.getValue());
        }
    }
}
