package composite;

import decorator.Duck;
import decorator.Quackable;

import java.util.ArrayList;

public class Flock {
    private ArrayList<Quackable> quackables;

    public Flock() {
        this.quackables = new ArrayList<>();
    }

    public void quack() {
        boolean first = true;
        for (Quackable q :
                quackables) {
            if (q instanceof Duck) {
                if (first) {
                    q.quack();
                    q.quack();
                    first = false;
                }
                q.quack();
            }
        }
    }

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }
}
