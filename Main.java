import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        expenseRecords myRecord = new expenseRecords();
        System.out.println("Hi, I am your Helper in handling you expense");
        while(1 > 0){
            System.out.println("Please tell what do you want? ");
            System.out.println("\nA. record my expense");
            System.out.println("B. show my expense");
            System.out.println("C. my total expenditure");
            System.out.println("D. done? if yes please press D");
            System.out.println("E. delete an unwanted expense?");
            System.out.println("\n");
            System.out.print("click A or B or C or D in capital only ");
            System.out.println("\n");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            switch (choice) {
                case 'A':
                    // asking what is the thing that you spent on?
                    System.out.print("On what you did you spent? ==> ");
                    String s = sc.nextLine();
                    // how much did it cost?
                    System.out.print("how much did you spent? (type the amount in number) ==> ");
                    double a = sc.nextDouble();
                    sc.nextLine();
                    // what group should we put into?
                    System.out.print("In what type should I update this ==> ");
                    String g = sc.nextLine();
                    System.out.print("\n");
                    System.out.print("Do you want to continue? feel free");
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
                case 'E':
                    System.out.print("which expense you want to delete (Give number): ");
                    int i = sc.nextInt();
                    sc.nextLine();

                    myRecord.deleteExpense(i);
                    break;
                default:
                    System.out.print("\n");
                    System.out.println("try again");
                    System.out.print("-");

            }
        }
    }
}