package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        Fruits f1 = new Fruits("peach","red",67,65);
        Fruits f2 = new Fruits("papaya","yellow",77,85);
        Fruits f3 = new Fruits("apricot","orange",89,80);
        Fruits f4 = new Fruits("orange","orange",120,65);
        Fruits f5 = new Fruits("fruit5","red",67,65);
        Fruits f6 = new Fruits("fruit6","yellow",77,85);
        Fruits f7 = new Fruits("fruit7","orange",89,80);
        Fruits f8 = new Fruits("fruit8","red",120,65);

        List<Fruits> al = new ArrayList<>();
        al.add(f1);
        al.add(f2);
        al.add(f3);
        al.add(f4);
        al.add(f5);
        al.add(f6);
        al.add(f7);
        al.add(f8);
        HashSet<String> hs =  new HashSet<>();
      List<String> colour =  al.stream().map(i->i.getColour()).collect(Collectors.toList());
        hs.addAll(colour);
        List<String> col = new ArrayList<>();
        col.addAll(hs);
        System.out.println(hs);
        for (int j = 0; j <col.size() ; j++) {

            int finalJ = j;
            System.out.println("Colour of the fruits : "+ col.get(j));
            System.out.println();
            al.stream().filter(i->i.getColour().equals(col.get(finalJ))).forEach(System.out::println);
        }





    }
}
