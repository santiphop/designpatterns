package abstractfactory;

import decorator.Duck;

public class DuckFactory1 {

    public DuckFactory1() {

    }

    public Duck makeDuck() {
        return new Duck();
    }


}
