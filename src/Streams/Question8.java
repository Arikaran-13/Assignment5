package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String[] args) {
        Trader t1 = new Trader("Markus","mumbai");
        Trader t2 = new Trader("milne","delhi");
        Trader t3 = new Trader("Vecna","chennai");
        Trader t4 = new Trader("hopper","alaska");
        Trader t5 = new Trader("will","california");
        Trader t6 = new Trader("dustin","India");
        Trader t7 = new Trader("lorna","california");
        Trader t8 = new Trader("hopper","texas");

        List<Trader> al = new ArrayList<>();
        al.add(t1); al.add(t2); al.add(t3); al.add(t4); al.add(t5); al.add(t6); al.add(t7);
        al.add(t8);

       Set<String> cities =  al.stream().map(i->i.getCity()).collect(Collectors.toSet());
        System.out.println(cities);
    }
}
