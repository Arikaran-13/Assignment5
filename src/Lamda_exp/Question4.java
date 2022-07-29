package Lamda_exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("cat");
        al.add("even");
        al.add("odd");
        al.removeIf(i-> i.length()%2 !=0);
        System.out.println(al);
    }
}
