import java.io.*;
import java.util.*;

class expenseFileHandler {
    // saving your expenses in the file
    static void save(ArrayList<expense> record) {
        try {
            PrintWriter expenseWriter = new PrintWriter("data.txt");
            // writing and having record of each expense
            for (expense e : record) {
                expenseWriter.println(e.amt + "," + e.spent_on + "," + e.group);
            }
            expenseWriter.close();
        } catch (Exception e) {
            System.out.println("problem faced while saving your data");
        }
    }
    // extracting/ loading the expenses from the file
    static ArrayList<expense> load() {
        ArrayList<expense> list = new ArrayList<>();
        try {
            File aFile = new File("data.txt");

            if (!aFile.exists()) {
                return list;
            }
            Scanner sc = new Scanner(aFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                double amt = Double.parseDouble(parts[0]);
                String spent = parts[1];
                String group = parts[2];
                list.add(new expense(amt, spent, group));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error while loading data");
        }
        return list;
    }
}