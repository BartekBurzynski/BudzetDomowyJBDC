package factory;

import dao.TransactionDAO;
import model.Transaction;

import java.sql.SQLException;
import java.util.Scanner;

public class SaveTransaction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj typ");
        String type = input.nextLine();

        System.out.println("Podaj opis");
        String description = input.nextLine();
        System.out.println("Podaj ilość");
        int amount = input.nextInt();
        input.nextLine();
        System.out.println("Podaj date");
        String date = input.nextLine();


        Transaction transaction = new Transaction(type, description, amount, date);

        TransactionDAO transactionDAO = new TransactionDAO();
        transactionDAO.insert(transaction);
    }
}
