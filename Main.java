import java.util.*;
// importing all the utilities
public class Main {
    // this is the actual function which will use all the files.
    // this function and the user will interact basically the main function runs first.
    public  static void  main(String[] args){
        // this is scanner class and the sc an object to take the inputs.
         Scanner sc =new Scanner(System.in);
        // created an object myRecord for simple understanding.
        expenseRecords myRecord = new expenseRecords();
        System.out.print("\n");
        // this is the message so that the user can feel like this app is talking to them
        System.out.println("Hi, I can help in handling you expenses");
        while(1 > 0){
            System.out.println("Choose one of following only");
            System.out.print("\n");
            System.out.println("A. record your expense");
            System.out.println("B. show your expense");
            System.out.println("C. your total expenditure");
            System.out.println("D. delete an unwanted expense?");
            System.out.println("E. not anymore? if yes please press E");
            System.out.println("\n");
            System.out.print("click A or B or C or D or E in capital only ");
            System.out.println("\n");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            switch (choice) {
                case 'A':
                    // asking what is the thing that you spent on?
                    System.out.println("\n");
                    System.out.print("On what did you spent? (name the object) ==> ");
                    String s = sc.nextLine();
                    // how much did it cost?
                    System.out.print("how much did you spent? (type the amount in number) ==> ");
                    double a = sc.nextDouble();
                    sc.nextLine();
                    // what group should we put into?
                    System.out.print("In what type should I update this (category / group) ==> ");
                    String g = sc.nextLine();
                    System.out.println("\n");
                    // giving message to give a good feel like how we ask in real life
                    System.out.println("continue? feel free");
                    // this function is recording the user expense with these 3 variables
                    myRecord.recordAnExpense(new expense(a, s, g));
                    
                    break;
                case 'B':
                    System.out.println("\n"); 
                    // this function will show all the expenses stored the the  data file
                    myRecord.displayExpenses();
                    // here again
                    System.out.println("continue? feel free");
                    break;
                case 'C':
                    System.out.println("\n"); 
                    // giving the overall total of the all expenses
                    System.out.println("you spend total " + myRecord.totalExpense());
                    System.out.println("\n");
                    // here again
                    System.out.println("continue? feel free");
                    break;
                case 'D':
                    // this is to delete a faulty or some waste record
                    System.out.println("\n");
                    System.out.print("give me the expense no. / index to delete  ==> ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    myRecord.deleteExpense(n);
                    System.out.println("\n");
                    System.out.println("continue? feel free");
                    break;
                case 'E':
                    System.out.println("\n");
                    // this is to save all the records
                    expenseFileHandler.save(myRecord.record);
                    System.out.println("recorded, thank you ");
                    
                    System.exit(0);
                default:
                    System.out.print("\n");
                    System.out.println("try again");
                    System.out.println("\n");
                    

            }
        }
    }
}