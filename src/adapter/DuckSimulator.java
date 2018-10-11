package adapter;

import java.util.ArrayList;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedheadDuck();
        Quackable duck3 = new RubberDuck();
        GooseAdapter goose = new GooseAdapter(new Goose());
        PigeonAdapter pigeon = new PigeonAdapter(new Pigeon());

        ArrayList<Quackable> list = new ArrayList<>();

        list.add(duck1);
        list.add(duck2);
        list.add(duck3);
        list.add(goose);
        list.add(pigeon);

        for (Quackable q :
                list) {
            q.quack();
        }

    }
}
