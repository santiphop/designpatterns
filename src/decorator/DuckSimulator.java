package decorator;

import java.util.ArrayList;

public class DuckSimulator {
    public static void main(String[] args) {
        Quackable duck1 = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable duck2 = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duck3 = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

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
        System.out.println(QuackCounter.getCount());
    }
}
