package Lamda_exp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(6);
        al.add(4);
        al.add(2);
        al.add(1);
        al.add(9);

        // predicate interface
        al.stream().filter(i-> i%5==0).forEach(System.out::println);
        boolean b = al.stream().allMatch(i-> i%2==0);
        System.out.println(b);

        // supplier interface
        System.out.println( al.stream().collect(Collectors.toList()));
        // functional

      List<Integer> l = al.stream().map(i-> i*2).collect(Collectors.toList());

      // consumer

        al.stream().map(i-> i%2).forEach(System.out::println);
    }
}

