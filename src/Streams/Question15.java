package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question15 {
    public static void main(String[] args) {
        News n1 = new News(1,"Ak","anderson","informative");
        News n2 = new News(2,"Ak","charles","informative");
        News n3 = new News(1,"Ak","tony","informative");
        News n4 = new News(1,"Ak","anderson","informative");

        ArrayList<News> al = new ArrayList<>();
        al.add(n1); al.add(n2); al.add(n3); al.add(n4);

       Map<String,Long> m = al.stream().map(i->i.getCommentByUser()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m);

        Comparator<Long> comp = new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o1.compareTo(o2);
            }
        };
        Long val = m.entrySet().stream().map(i -> i.getValue()).max(comp).get();

        for(Map.Entry<String,Long>i : m.entrySet()){
            if(val.equals(i.getValue())){
                System.out.println(i.getKey());
            }
        }

    }
}
