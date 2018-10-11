package abstractfactory;

import decorator.QuackCounter;
import decorator.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckFactory1 f1 = new DuckFactory1();
        DuckFactory2 f2 = new DuckFactory2();
        DuckFactory3 f3 = new DuckFactory3();

        Quackable q1 = f1.makeDuck();
        Quackable q2 = f2.makeDuck();
        Quackable q3 = f3.makeDuck();

        q1.quack();
        q2.quack();
        System.out.println("count = " + QuackCounter.getCount());
        q3.quack();
    }
}
