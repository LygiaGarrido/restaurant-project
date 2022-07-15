package mindswap.module1.introduction.restaurant;

public class Table {
    private boolean status;
    private String order;

    public Table() {
        this.status = true;
    }


    public void cleanOrder(int i) {
        this.order = "";

    }

    public void getOrder() {

    }

    public void setStausOfTable(boolean status) {
        this.status = status;
    }

    public boolean isFree() {
        return status == true;
    }

    public void occupy() {
        status = false;
    }

    public void saveOrder(String order) {
        this.order = order;
        System.out.println("Here's a hot plate of " + order);
    }

    public void unoccupy() {
        status = true;
    }
}
