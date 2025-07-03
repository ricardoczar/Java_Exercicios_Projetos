package application;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.println("Number:");
		int number = input.nextInt();
		input.nextLine();
		System.out.println("Holder:");
		String name = input.nextLine();
		System.out.println("Initial balance:");
		double balance = input.nextDouble();
		System.out.println("Withdra limit:");
		double withdrawLimit = input.nextDouble();
		System.out.println("Enter amount for withdraw:");
		double amountwithdraw = input.nextDouble();
		Account client = new Account(number, name, balance, withdrawLimit);
		try {
			client.withdraw(amountwithdraw);
		} catch (WithdrawLimitExceededException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
		input.close();

	}

}
