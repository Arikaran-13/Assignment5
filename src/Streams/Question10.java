package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        Trader t1 = new Trader("Markus","pune");
        Trader t2 = new Trader("milne","delhi");
        Trader t3 = new Trader("Vecna","chennai");
        Trader t4 = new Trader("hopper","delhi");
        Trader t5 = new Trader("Arikaran","pune");
        Trader t6 = new Trader("dustin","India");
        Trader t7 = new Trader("lorna","delhi");
        Trader t8 = new Trader("Anish kumar","pune");

        List<Trader> al = new ArrayList<>();
        al.add(t1); al.add(t2); al.add(t3); al.add(t4); al.add(t5); al.add(t6); al.add(t7);
        al.add(t8);

        Comparator<Trader> comp = new Comparator<Trader>() {
            @Override
            public int compare(Trader o1, Trader o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        al.stream().sorted(comp).forEach(System.out::println);
    }
}
