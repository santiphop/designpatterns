package statedesign;

public class ReadyState implements State {
    VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void chooseStation(int i) {
        System.out.println("choosing station...");
        vendingMachine.setPrice(i);
        vendingMachine.setState(vendingMachine.getInsertingState());
    }

    @Override
    public void insertMoney(int i) {
        System.out.println("please choose a station first.");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first.");
    }

    @Override
    public String toString() {
        return "ReadyState";
    }
}
