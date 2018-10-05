package decorator;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int count;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }


    @Override
    public void quack() {
        quackable.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }
}
