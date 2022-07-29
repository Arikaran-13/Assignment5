package Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        News n1 = new News(1,"Ak","anderson","informative");
        News n2 = new News(2,"Ak","charles","informative");
        News n3 = new News(1,"Ak","tony","informative");
        News n4 = new News(1,"Ak","anderson","informative");


        ArrayList<News> al = new ArrayList<>();
        al.add(n1); al.add(n2); al.add(n3); al.add(n4);

     List<String> users =   al.stream().map(i->i.getCommentByUser()).collect(Collectors.toList());
        Map<String,Long> map=   users.stream().collect( Collectors.groupingBy(i->i,Collectors.counting()));

        System.out.println("The Number of comment given by each user are: ");
        System.out.println(map);


    }
}
