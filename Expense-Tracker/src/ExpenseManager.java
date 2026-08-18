import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully.");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        for (Expense expense : expenses) expense.display();
    }

    public void searchByCategory(String category) {
        boolean found = false;
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                expense.display();
                found = true;
            }
        }
        if (!found) System.out.println("No expenses found in this category.");
    }

    public void deleteExpense(int id) {
        Expense expenseToDelete = null;
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expenseToDelete = expense;
                break;
            }
        }
        if (expenseToDelete != null) {
            expenses.remove(expenseToDelete);
            System.out.println("Expense deleted successfully.");
        } else {
            System.out.println("Expense not found.");
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) total += expense.getAmount();
        return total;
    }

    public Expense getHighestExpense() {
        if (expenses.isEmpty()) return null;
        Expense highest = expenses.get(0);
        for (Expense expense : expenses) {
            if (expense.getAmount() > highest.getAmount()) highest = expense;
        }
        return highest;
    }
}
