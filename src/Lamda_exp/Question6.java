package Lamda_exp;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class Question6  {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Zebra");
        al.add("eagle");
        al.add("night fish");
        al.add("shark");
        al.add("apes");
        al.add("rabbit");

       // al.stream().map(String::toUpperCase).forEach(System.out::println);

       al.replaceAll(new demo());
        System.out.println(al);
    }


}
class demo implements UnaryOperator<String> {

    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}