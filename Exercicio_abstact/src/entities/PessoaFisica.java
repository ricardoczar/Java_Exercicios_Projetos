package entities;

public class PessoaFisica extends Pessoa {
	
	private Double valorSaude;
	
	public PessoaFisica() {
		super();
	}


	public PessoaFisica(String nome, Double renda, Double valorSaude) {
		super(nome, renda);
		this.valorSaude = valorSaude;
	}
	



	@Override
	public double imposto() {
		double total = 0.0;
		double imposto=0.0;
		if (getRenda() < 20000.00) {
		imposto =  getRenda() * 0.15;
		} else if (getRenda() > 20000.00) {
			imposto = getRenda() * 0.25;
		}
		if(valorSaude > 0) {
			total = imposto - valorSaude/2;
		}

		return total;
	}

}
