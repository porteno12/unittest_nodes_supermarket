public class SuperMarket {
    private String name; // Store name
    private int amount;  // Eggs amount in inventory

    // Constructor
    public SuperMarket(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
