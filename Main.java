import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        expenseRecords myRecord = new expenseRecords();
        while(1 > 0){
            System.out.println("below are the service we can provide");
            System.out.println("\na. record my expense");
            System.out.println("b. show my expense");
            System.out.println("c. my total expenditure");
            System.out.println("d. take an exit?");
            System.out.println("\n");
            System.out.print("click A or B or C or D in capital only ");
            System.out.println("\n");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            switch (choice) {
                case 'A':
                    // asking what is the thing that you spent on?
                    System.out.print("On what you did you spent? ");
                    String s = sc.nextLine();
                    // how much did it cost?
                    System.out.print("how much did you spent? type a number ");
                    double a = sc.nextDouble();
                    sc.nextLine();
                    // what group should we put into?
                    System.out.print("which group does it fit in? ");
                    String g = sc.nextLine();
                    System.out.print("\n");
                    myRecord.recordAnExpense(new expense(a, s, g));
                    break;
                case 'B':
                    System.out.print("\n");
                    System.out.print("-");
                    myRecord.displayExpenses();
                    System.out.print("-");
                    break;
                case 'C':
                    System.out.print("\n");
                    System.out.print("-");
                    System.out.println("you spend a total of " + myRecord.totalExpense());
                    System.out.print("-");
                    break;
                case 'D':
                    System.out.print("\n");
                    System.out.print("-");
                    expenseFileHandler.save(myRecord.record);
                    System.out.println("recorded, thank you ");
                    System.out.print("-");
                    System.exit(0);
                default:
                    System.out.print("\n");
                    System.out.println("try again");
                    System.out.print("-");

            }
        }
    }
}