import java.util.*;

class expenseRecords {
    // Record of all expenses with their attributes
    ArrayList <expense> record = expenseFileHandler.load();
    void recordAnExpense(expense e){
        record.add(e);
    }
    // to display the expenses
    void displayExpenses() {
        if(record.isEmpty()){
            System.out.println("empty record of expense");
            return;
        }
        int i = 1;
        for (expense e : record){
            System.out.println(i++);
            System.out.print("Object ==> ");
            System.out.println(e.spent_on);
            System.out.print("amount ==> ");
            System.out.println(e.amt);
            System.out.print("group / type ==> ");
            System.out.println(e.group);
            System.out.println("");
        }
    }
    // to add the total expense
    double totalExpense(){
        double sum = 0;
        for (expense e : record){
            sum += e.amt;
        }
        return sum;
    }

    // delete an expense using index
    void deleteExpense(int i) {

        if (i < 1 || i > record.size()) {
            System.out.println("Invalid exp number");
            return;
        }

        record.remove(i - 1);
        System.out.print(i);
        System.out.print(" ");
        System.out.println("erased");
    }
}