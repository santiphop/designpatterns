package statedesign;

public class VendingMachine {
    private State readyState;
    private State insertingState;
    private State finishState;

    private State state;
    private int currentMoney;
    private int price;

    public VendingMachine() {
        currentMoney = 0;
        readyState = new ReadyState(this);
        insertingState = new InsertingState(this);
        finishState = new FinishState(this);
        state = readyState;
        System.out.println("Vending Machine is ready to service :)");
    }

    public void addMoney(int i) {
        currentMoney += i;
    }

    public void setZeroMoney() {
        currentMoney = 0;
    }

    public int changeMoney() {
        return currentMoney - price;
    }

    public void chooseStation(int i) {
        state.chooseStation(i);
    }

    public void insertQuarter(int i) {
        state.insertMoney(i);
    }

    public void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public State getReadyState() {
        return readyState;
    }

    public State getInsertingState() {
        return insertingState;
    }

    public State getFinishState() {
        return finishState;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public int getPrice() {
        return price;
    }

    public int getRemainMoney() { return price - currentMoney; }

    @Override
    public String toString() {
        return "current state is " + state;
    }
}
