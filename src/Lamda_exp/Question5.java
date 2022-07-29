package Lamda_exp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String[] args) {
       List<String> al = new ArrayList<>();
       al.add("Zebra");
       al.add("eagle");
       al.add("night fish");
       al.add("shark");
       al.add("apes");
       al.add("rabbit");

       StringBuilder ans= new StringBuilder("");

      al.stream().map(i-> i.charAt(0)).forEach(System.out::print);


    }
}
