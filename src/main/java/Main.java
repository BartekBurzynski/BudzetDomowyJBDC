import factory.DelateTransaction;
import factory.SaveTransaction;
import factory.UptadeTransaction;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner input = new Scanner(System.in);
        
        if (input.nextLine().equals("delate")){
            DelateTransaction delateTransaction = new DelateTransaction();
            delateTransaction.delateTransactionFromApplication();;
        }else if (input.nextLine().equals("uptade")){
            UptadeTransaction uptadeTransaction = new UptadeTransaction();
            uptadeTransaction.uptadeTransactionByUserToApplication();
        }else if (input.nextLine().equals("save")){
            SaveTransaction saveTransaction = new SaveTransaction();
            saveTransaction.downloadAndSaveTransactionToAppliation();
        }
    }
}
