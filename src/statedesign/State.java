package statedesign;

public interface State {
    void chooseStation(int i);
    void insertMoney(int i);
    void dispense();
}
