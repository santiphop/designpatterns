package decorator;

public class QuackEcho implements Quackable {

    private Quackable quackable;

    public QuackEcho(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.print("echo: ");
        quackable.quack();
    }
}
