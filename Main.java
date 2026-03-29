import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        expenseRecords myRecord = new expenseRecords();
        System.out.println("Hi, I can help in handling you expenses");
        while(1 > 0){
            System.out.println("Please tell me? ");
            // add a new line and remove below a new line
            System.out.println("\nA. record your expense");
            System.out.println("B. show your expense");
            System.out.println("C. your total expenditure");
            System.out.println("D. delete an unwanted expense?");
            System.out.println("E. not anymore? if yes please press D");
            System.out.println("\n");
            System.out.print("click A or B or C or D or E in capital only ");
            System.out.println("\n");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            switch (choice) {
                case 'A':
                    // asking what is the thing that you spent on?
                    // System.out.print("\n");
                    System.out.print("On what did you spent? (name the object) ==> ");
                    String s = sc.nextLine();
                    // how much did it cost?
                    System.out.print("how much did you spent? (type the amount in number) ==> ");
                    double a = sc.nextDouble();
                    sc.nextLine();
                    // what group should we put into?
                    System.out.print("In what type should I update this (category / group) ==> ");
                    String g = sc.nextLine();
                    System.out.print("\n");
                    System.out.print("Do you want to continue? feel free");
                    myRecord.recordAnExpense(new expense(a, s, g));
                    System.out.print("\n"); // remove
                    break;
                case 'B':
                    System.out.print("\n"); 
                    System.out.print("-"); // remove
                    myRecord.displayExpenses();
                    System.out.print("-"); // remove
                    System.out.print("Do you want to continue? feel free");
                    break;
                case 'C':
                    System.out.print("\n"); 
                    System.out.print("-"); // remove
                    System.out.println("you spend a total of " + myRecord.totalExpense());
                    System.out.print("Do you want to continue? feel free");
                    System.out.print("-"); // remove add new line
                    break;
                case 'D':
                    // add new line
                    System.out.print("which expense you want to delete (Give number): ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    myRecord.deleteExpense(i);
                    System.out.print("Do you want to continue? feel free");
                    //add a new line
                    break;
                case 'E':
                    System.out.print("\n");
                    System.out.print("-"); // remove
                    expenseFileHandler.save(myRecord.record);
                    System.out.println("recorded, thank you ");
                    System.out.print("-"); // remove
                    System.exit(0);
                default:
                    System.out.print("\n");
                    System.out.println("try again");
                    System.out.print("-"); // remove and add new line

            }
        }
    }
}