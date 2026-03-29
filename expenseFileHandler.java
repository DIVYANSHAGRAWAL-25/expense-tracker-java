// importing the input/output module to read and write a file
import java.io.*;
// importing all the utilities
import java.util.*;

class expenseFileHandler {
    // saving the list of all the expenses in a file
    static void save(ArrayList<expense> record) {
        try {
            PrintWriter expenseWriter = new PrintWriter("data.txt" );
            //  saves the content in the data.txt file by PrintWriter and by the for loop (amt, spent_on, group) format
            for (expense e : record ) {
                expenseWriter.println(e.amt+","+e.spent_on+","+e.group);
            }
            expenseWriter.close();
        } 
        // if there is an exception then we catch to avoid program crash
        catch (Exception e) {
            System.out.println("not save your data, some problem / error occured");
        }
    }
    // extracting/ loading the expenses from the file returns the list of expense object
    static ArrayList<expense> load() {
        ArrayList <expense> list = new ArrayList<>();
        try {
            File aFile = new File("data.txt");
            if (!aFile.exists() ) {
                return list;
            }
            // if there is not any file then we will imput the file that we made and gave the name aFile
            Scanner sc =  new Scanner(aFile);
            while(sc.hasNextLine()){
                String line =  sc.nextLine();
                
                // dividing the (amt, spent_on, group) components in three different variables to add in the list.
                // dividing by split function
                // we are using parse to convert the string amt in double amt
                String[] component =  line.split(",");
                double amt = Double.parseDouble(component[0]);
                String spent = component[1];
                String group = component[2];
                list.add(new expense(amt, spent, group) );
            }
            sc.close();
        } 
        // if an error comes to load the file, we catch to void the crash.
        catch (Exception e ) {
            System.out.println("I am not able load data due to some error");
        }
        return list;
    }
}