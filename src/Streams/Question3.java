package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {

    public static void main(String[] args) {
        Fruits f1 = new Fruits("peach","red",67,65);
        Fruits f2 = new Fruits("papaya","yellow",77,85);
        Fruits f3 = new Fruits("apricot","orange",89,80);
        Fruits f4 = new Fruits("orange","orange",120,65);
        Fruits f5 = new Fruits("fruit5","red",67,90);
        Fruits f6 = new Fruits("fruit6","yellow",77,85);
        Fruits f7 = new Fruits("fruit7","orange",89,80);
        Fruits f8 = new Fruits("fruit8","red",120,71);
        List<Fruits> al = new ArrayList<>();
        al.add(f1);
        al.add(f2);
        al.add(f3);
        al.add(f4);
        al.add(f5);
        al.add(f6);
        al.add(f7);
        al.add(f8);

       List<Fruits> redf=  al.stream().filter(i->i.getColour().equals("red")).collect(Collectors.toList());
        Comparator<Fruits> comp = new Comparator<Fruits>() {
            @Override
            public int compare(Fruits o1, Fruits o2) {
                if(o1.getPrice()>o2.getPrice())return 1;
                else if (o1.getPrice()<o2.getPrice()) return -1;
                return 0;
            }
        };
        redf.sort(comp);
        System.out.println(redf);
    }
}
