package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Locacao {

	private Cliente cliente;
	private Veiculo veiculo;
	private LocalDate dateInicio;
	private LocalDate dataFim;

	public Locacao() {
	}

	public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dateInicio, LocalDate dataFim) {
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dateInicio = dateInicio;
		this.dataFim = dataFim;
	}

	public double calcularValorTotal() {
		long dias = ChronoUnit.DAYS.between(dateInicio, dataFim);
		return  veiculo.calcularDiaria() * dias;
	}
	
	@Override
	public String toString() {
		
		return "Cliente: " + cliente.getNome()
        + "\nCPF: " + cliente.getCpf()
        + "\nModelo do veículo: " + veiculo.getModelo()
        + "\nPlaca do veículo: " + veiculo.getPlaca()
        + "\nData da locação: " + dateInicio
        + "\nData de devolução: " + dataFim
        + String.format("\nValor total: R$ %.2f", calcularValorTotal());
				
	}
	
}
