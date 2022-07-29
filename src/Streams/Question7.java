package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
         Trader t1 = new Trader("Markus","hawkings");
        Trader t2 = new Trader("milne","argentina");
        Trader t3 = new Trader("Vecna","upsideDown");
        Trader t4 = new Trader("hopper","russia");

        Transaction tr1 = new Transaction(t1,2011,50000);
        Transaction tr2 = new Transaction(t2,2021,40000);
        Transaction tr3 = new Transaction(t3,2011,10000);
        Transaction tr4 = new Transaction(t4,2019,450000);
        List<Transaction> al = new ArrayList<>();
        al.add(tr1);
        al.add(tr2);
        al.add(tr3);
        al.add(tr4);
Comparator<Transaction> comp = new Comparator<Transaction>() {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        if(o1.getValue()>o2.getValue())return 1;
        else if(o1.getValue()<o2.getValue())return -1;
        return 0;
    }
};
        al.stream().filter(i->i.getYear()==2011).sorted(comp).forEach(System.out::println);

    }
}
