package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import entities.CarroPequeno;
import entities.Cliente;
import entities.Locacao;
import entities.SUV;
import entities.Sedan;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		ArrayList<Veiculo> frota = new ArrayList<Veiculo>();

		frota.add(new CarroPequeno("STA-1234", "Uno"));
		frota.add(new Sedan("ABC-4321", "HB20"));
		frota.add(new SUV("EBY-2517", "Hilux"));

		Scanner input = new Scanner(System.in);
		System.out.println("Carros disponiveis dá frota de veiculos: ");

		for (int i = 0; i < frota.size(); i++) {
			Veiculo v = frota.get(i);
			System.out.println(i + 1 + " " + v.getModelo() + ", diaria: $" + v.calcularDiaria());
		}

		System.out.println("Digite o numero do carro que deseja alugar");

		int numero = input.nextInt();
		

		System.out.println("Nome:");
		input.nextLine();
		String nome = input.nextLine();
		System.out.println("CPF:");
		String cpf = input.nextLine();
		System.out.println("Dia da locação:");
		int diaLoc = input.nextInt();
		System.out.println("Mes da Locação");
		int mesLoc = input.nextInt();
		System.out.println("Ano da Locação");
		int anoLoc = input.nextInt();
		LocalDate dataInicial = LocalDate.of(anoLoc, mesLoc, diaLoc);
		System.out.println("Dia da devolução: ");
		int diaDev = input.nextInt();
		System.out.println("Mes da devolução");
		int mesDev = input.nextInt();
		System.out.println("Ano da devolução");
		int anoDev = input.nextInt();
		LocalDate dataFinal = LocalDate.of(anoDev, mesDev, diaDev);

		if (numero >= 1 && numero <= frota.size()) {
		    Locacao locacao = new Locacao(new Cliente(nome, cpf), frota.get(numero - 1), dataInicial, dataFinal);
		    System.out.println(locacao);
		} else {
		    System.out.println("Opção inválida.");
		}
		

		input.close();
	}

}
