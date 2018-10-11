package adapter;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        for (int i = 0; i < 2; i++) {
            pigeon.coo();
        }
    }
}
