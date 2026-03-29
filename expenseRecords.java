import java.util.*;

class expenseRecords {
    // Record of all expenses with their 3 details amt, spent_on and group
    // basically an array of objects.
    ArrayList <expense> record = expenseFileHandler.load();
    void recordAnExpense(expense e){
        record.add(e);
    }
    // to display the expenses (their 3 details)
    void displayExpenses() {
        if(record.isEmpty()){

            System.out.println("empty list of expenses.");
            return;
        }

        int i=1;
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

    // delete an expense using index which in unwanted or faulty
    void deleteExpense(int i ) {
        if (i<1 || i > record.size()) {
            System.out.println(" wrong exp (index) number");
            return;
        }
        record.remove(i-1);
        System.out.print(i);
        System.out.println(" record erased");
    }

    // total amount that user spent across all saved transactions
    double totalExpense(){
        double sum = 0;
        for (expense e : record){
            sum += e.amt;
        }
        return sum;
    }

    
}