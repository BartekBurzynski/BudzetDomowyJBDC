package factory;

import dao.TransactionDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class DelateTransaction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj id");
        int id = input.nextInt();

        TransactionDAO transactionDAO = new TransactionDAO();
        transactionDAO.deleteByID(id);

    }
}