package mindswap.module1.introduction.restaurant;

public class Restaurant {
    private boolean fullCapacity;
    private int numberOfOccupiedTables;
    private Table[] tables;


    public Restaurant(int amountOfTables) {
        this.fullCapacity = false;
        this.numberOfOccupiedTables = 0;
        this.tables = new Table[amountOfTables];
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table();
            freeTable(i);

        }
    }

    public int findTable() {
        if (tables == null) {
            System.out.println("Tables null.");
        }
        for (int i = 0; i < tables.length; i++) {
            if (tables[i].isFree()) {
                System.out.println("Welcome! Here's your table number: " + (i + 1));
                occupyTable(i);
                return i;
            }
        }
        System.out.println("We're full, sorry. Kindly go away.");
        return -1;
    }


    public void freeTable(int i) {
        tables[i].unoccupy();

    }


    public void order(String order, int tableNumber) {
        tables[tableNumber].saveOrder(order);
    }

    private void checkIfTableCanBeFreed() {

    }


    private void occupyTable(int i) {
        tables[i].occupy();
    }


}
