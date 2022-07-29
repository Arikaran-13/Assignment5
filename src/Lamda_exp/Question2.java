package Lamda_exp;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Evaluation{
    void printOrder();
}
public class Question2 {
    public static void main(String[] args) {
        Order o = new Order(1,20000,"ACCEPTED");
        Order o1 = new Order(2,1000,"REJECTED");
        Order o2 = new Order(3,20000,"ACCEPTED");
        Order o3 = new Order(4,30000,"REJECTED");
        Order o4 = new Order(5,30000,"COMPLETED");
        List<Order> l = new ArrayList<>();
        l.add(o);
        l.add(o1);
        l.add(o2);
        l.add(o3);
        l.add(o4);

        Evaluation e = () -> {
            l.stream().filter(i-> i.getAmt()>10000)
                    .filter(i-> i.getStatus() == "ACCEPTED" || i.getStatus() == "ACCEPTED")
                    .forEach(System.out::println);
        };
        e.printOrder();

    }
}
class Order{
    private int id;
    private int amt;
    private String status;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amt=" + amt +
                ", status='" + status + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(int id, int amt, String status) {
        this.id = id;
        this.amt = amt;
        this.status = status;
    }



    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}