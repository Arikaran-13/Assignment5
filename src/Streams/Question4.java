package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        News n1 = new News(1,"Ak","anderson","informative");
        News n2 = new News(2,"Ak","anderson","informative");
        News n3 = new News(1,"Ak","anderson","informative");
        News n4 = new News(1,"Ak","anderson","informative");

        List<News> al = new ArrayList<>();
        al.add(n1);
        al.add(n2);
        al.add(n3);
        al.add(n4);

      List<Integer> list= al.stream().map(i->i.getNewsid()).collect(Collectors.toList());
       TreeMap<Integer,Integer> hm = new TreeMap<>();

      for(int i=0;i<list.size();i++){
         // System.out.print(list.get(i) + ":");
           hm.put(list.get(i),Collections.frequency(list,list.get(i)));
         //  System.out.println();
       }
         int inx = hm.values().stream().max(Integer::compareTo).get();

  Set<Integer>s = hm.keySet();
        System.out.println("Newsid is : ");
  for(Integer i : s){
      if(hm.get(i) == inx){
          System.out.println(i);
          break;
      }
  }


    }
}
