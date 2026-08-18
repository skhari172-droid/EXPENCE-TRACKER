public class Expense {
    private int id;
    private String category;
    private String description;
    private double amount;

    public Expense(int id, String category, String description, double amount) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }

    public void display() {
        System.out.println("ID: " + id + " | Category: " + category + " | Description: " + description + " | Amount: ₹" + amount);
    }
}
