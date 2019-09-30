package factory;

import dao.TransactionDAO;
import model.Transaction;

import java.sql.SQLException;
import java.util.Scanner;

public class UptadeTransaction {
    public void uptadeTransactionByUserToApplication() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj id");
        int id = input.nextInt();
        input.nextLine();


        System.out.println("Podaj typ");
        String type = input.nextLine();

        System.out.println("Podaj opis");
        String description = input.nextLine();
        System.out.println("Podaj ilość");
        int amount = input.nextInt();
        input.nextLine();
        System.out.println("Podaj date");
        String date = input.nextLine();


        Transaction transaction = new Transaction(id, type, description, amount, date);

        TransactionDAO transactionDAO = new TransactionDAO();
        transactionDAO.update(transaction);
    }
}
