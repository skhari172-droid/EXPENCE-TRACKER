import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Search by Category");
            System.out.println("4. Delete Expense");
            System.out.println("5. Total Expenses");
            System.out.println("6. Highest Expense");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    manager.addExpense(new Expense(id, category, description, amount));
                    break;
                case 2:
                    manager.viewExpenses();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String searchCategory = sc.nextLine();
                    manager.searchByCategory(searchCategory);
                    break;
                case 4:
                    System.out.print("Enter Expense ID: ");
                    int deleteId = sc.nextInt();
                    manager.deleteExpense(deleteId);
                    break;
                case 5:
                    System.out.println("Total Expenses: ₹" + manager.getTotalExpenses());
                    break;
                case 6:
                    Expense highest = manager.getHighestExpense();
                    if (highest != null) {
                        System.out.println("Highest Expense:");
                        highest.display();
                    } else {
                        System.out.println("No expenses found.");
                    }
                    break;
                case 7:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
