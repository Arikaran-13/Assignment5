package Lamda_exp;

public class Question1 {
    public static void main(String[] args) {


        add c = (a,b)->{
            System.out.println(a + b);
        };

        sub s = (a,b) -> {
            System.out.println(a-b);
        };
        multi m = (a,b) -> {
            System.out.println(a*b);
        };

        div d = (a,b) -> {
            System.out.println(a/b);
        };
        c.add(2,3);
        s.sub(2,3);
        m.multi(2,3);
        d.div(2,3);

    }


}

@FunctionalInterface
interface add{

    void add(int i,int j);

}
@FunctionalInterface
interface sub{
    void sub(int a,int b);
}
@FunctionalInterface
interface multi{
    void multi(int a,int b);
}
@FunctionalInterface
interface div{
    void div(int a,int b);
}