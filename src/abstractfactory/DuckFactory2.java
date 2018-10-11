package abstractfactory;

import decorator.Duck;
import decorator.QuackCounter;
import decorator.Quackable;

public class DuckFactory2 {
    public DuckFactory2() {

    }

    public Quackable makeDuck() {
        return new QuackCounter(new Duck());
    }
}
