package OOPS.Questions.question13;

public class Product {
    private String name ;
    private int quantity;
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuatity() {
        return quantity;
    }
    public void setQuatity(int quatity) {
        this.quantity = quatity;
    }


}
