package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		ArrayList<Pessoa> List = new ArrayList<Pessoa>();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of tax payers: ");
		double n = input.nextDouble();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer ", i + 1 , " data: ");
			System.out.println("Individual or company (i/c)?");
			char c = input.next().charAt(0);
			System.out.println("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.println("Anual income: ");
			double AnualIncome = input.nextDouble();
			if (c == 'i') {
				System.out.println("Helth expenditures: ");
				double HelthExpenditures = input.nextDouble();
				List.add(new PessoaFisica(name, AnualIncome, HelthExpenditures));
			} else if(c == 'c'){
				System.out.println("Number of emplooyes: ");
				int employees = input.nextInt();
				List.add(new PessoaJuridica(name,AnualIncome, employees));
			}
			
			

		}

		for (Pessoa pessoa : List) {
			System.out.println(String.format("%s: $ %.2f", pessoa.getNome(), pessoa.imposto()));
		}
		double total = 0.0;
		for (Pessoa pessoa : List) {
			total += pessoa.imposto();
		}
		System.out.println(String.format("TOTAL TAXES : $ %.2f" , total));
		input.close();

	}

}
