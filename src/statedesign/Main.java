package statedesign;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine);

        vendingMachine.dispense();
        vendingMachine.insertQuarter(10);
        vendingMachine.chooseStation(32);
        System.out.println(vendingMachine);

        vendingMachine.chooseStation(32);
        vendingMachine.dispense();
        vendingMachine.insertQuarter(10);
        vendingMachine.insertQuarter(10);
        vendingMachine.insertQuarter(10);
        vendingMachine.insertQuarter(5);
        System.out.println(vendingMachine);

        vendingMachine.insertQuarter(5);
        vendingMachine.chooseStation(52);
        vendingMachine.dispense();
    }
}
