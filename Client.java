package mindswap.module1.introduction.restaurant;

public class Client {
    private int noTable;
    private int tableNumber;
    private Restaurant myRestaurant;

    public Client() {
        this.noTable = -1;
        this.tableNumber = noTable;
        this.myRestaurant = myRestaurant;
    }


    public void order(String food) {
        if (tableNumber == noTable) {
            System.out.println("You need a table before you can eat.");
            return;
        }
        myRestaurant.order(food, tableNumber);
    }

    public void setRestaurant(Restaurant restaurant) {
        this.myRestaurant = restaurant;
    }

    public void askForTable() {
        if (myRestaurant == null) {
            System.out.println("Oh wait...I need to go to a restaurant before I can do this!");
            return;
        }
        tableNumber = myRestaurant.findTable();
    }

    public void pay() {

    }

    private void checkRestaurantPresence() {

    }

}
