package statedesign;

public class InsertingState implements State {
    VendingMachine vendingMachine;

    public InsertingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void chooseStation(int i) {
        System.out.println("you have chose a station.");

    }

    @Override
    public void insertMoney(int i) {
        System.out.println("inserting money...");
        vendingMachine.addMoney(i);
        if (vendingMachine.getCurrentMoney() >= vendingMachine.getPrice())
            vendingMachine.setState(vendingMachine.getFinishState());
        System.out.println("current money is " + vendingMachine.getCurrentMoney() + " baht.");
    }

    @Override
    public void dispense() {
        System.out.println("not enough money.");
    }

    @Override
    public String toString() {
        return "InsertingState";
    }
}
