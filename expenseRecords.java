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
            System.out.println("Expenditure is on ");
            System.out.println(e.spent_on);
            System.out.println("Expenditure amt spend ");
            System.out.println(e.amt);
            System.out.println("Expenditure is of group ");
            System.out.println(e.group);
            System.out.println("");
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
}