package Streams;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        Fruits f1 = new Fruits("peach","red",67,65);
        Fruits f2 = new Fruits("papaya","yellow",77,85);
        Fruits f3 = new Fruits("apricot","orange",89,80);
        Fruits f4 = new Fruits("Apple","red",120,65);
        List<Fruits> al = new ArrayList<>();
        al.add(f1);
        al.add(f2);
        al.add(f3);
        al.add(f4);

        al.stream().filter(i->i.getCalories()<100).map(i->i.getName()).forEach(System.out::println);
    }
}
