package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String[] args) {
        News n1 = new News(1,"Ak","budget postponed","informative");
        News n2 = new News(2,"Ak","budget proposed","informative");
        News n3 = new News(1,"Ak","anderson anchoring was good","informative");

        List<News> l = new ArrayList<>();
        l.add(n1);
        l.add(n2);
        l.add(n3);
       List<String> al = l.stream().map(i->i.getCommentByUser()).collect(Collectors.toList());
String sb="";
int count=0;
        for (int i = 0; i <al.size() ; i++) {
           sb =  al.get(i);
           if(sb.indexOf("budget") != -1){
               count++;
           }
        }
        System.out.println("The word budget repeated in the user comment by : ");

        System.out.println(count);



    }
}
