package Lamda_exp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Question7 {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"chennai");
        hm.put(2,"Mumbai");
        hm.put(3,"bangalore");
        hm.put(4,"delhi");

       Set<Map.Entry<Integer,String>> keyval =  hm.entrySet();

       StringBuilder sb = new StringBuilder("");

       for(Map.Entry<Integer,String>i : keyval){

          sb.append(i);
       }
        System.out.println(sb);

    }
}
