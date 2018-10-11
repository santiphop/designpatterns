package composite;

import decorator.*;

public class DuckSimulator {
    public static void main(String[] args) {
        Flock flock = new Flock();
        for (int i = 0; i < 10; i++) {
            flock.add(new Duck());
        }
        flock.add(new GooseAdapter(new Goose()));
        flock.add(new PigeonAdapter(new Pigeon()));

        flock.quack();
    }

}
