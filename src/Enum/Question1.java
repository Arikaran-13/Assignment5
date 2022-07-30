package Enum;
 enum Status{

     NEW(1) , REJECTED(-1) , ACCEPTED(0) , COMPLETED(2);
private int i;
     Status(int i){
         this.i=i;
     }

}

public class Question1 {
    public static void main(String[] args) {
         Order o1 = new Order(1,"bats",23,1200,Status.NEW);
         Order o2 = new Order(2,"gloves",23,1000,Status.COMPLETED);
         Order o3 = new Order(3,"medikit",25,1000,Status.REJECTED);
         Order o4 = new Order(4,"net",2,1000,Status.ACCEPTED);

        System.out.println(o1.getS());
        System.out.println(o2.getS());
        System.out.println(o3.getS());
        System.out.println(o4.getS());
    }

}
//s Order that maintains order status along with order id, name, quantity, price
class Order{

    private int id;
    private String name;
    private int q;
    private int p;
private Status s;
Order(){

}

    public Order(int id, String name, int q, int p, Status s) {
        this.id = id;
        this.name = name;
        this.q = q;
        this.p = p;
     this.s=s;
    }

    public Status getS() {
        return s;
    }

    public void setS(Status s) {
        this.s = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
}