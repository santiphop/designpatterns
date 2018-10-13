package statedesign;

public class FinishState implements State {
    VendingMachine vendingMachine;

    public FinishState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void chooseStation(int i) {
        System.out.println("you have chose a station");
    }

    @Override
    public void insertMoney(int i) {
        System.out.println("you have enough money.");
    }

    @Override
    public void dispense() {
        System.out.println("dispensing ticket...");
        System.out.println("returning change " + vendingMachine.changeMoney() + " baht...");
        vendingMachine.setZeroMoney();
        vendingMachine.setState(vendingMachine.getReadyState());
        System.out.println("Vending Machine is ready to service :)");
    }

    @Override
    public String toString() {
        return "FinishState";
    }
}
