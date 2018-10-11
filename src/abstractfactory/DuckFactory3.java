package abstractfactory;

import decorator.Duck;
import decorator.QuackCounter;
import decorator.QuackEcho;
import decorator.Quackable;

public class DuckFactory3 {
    public DuckFactory3() {

    }

    public Quackable makeDuck() {
        return new QuackEcho(new QuackCounter(new Duck()));
    }
}
