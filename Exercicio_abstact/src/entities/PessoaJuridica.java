package entities;

public class PessoaJuridica extends Pessoa {

	private Integer funcionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		double imposto = 0.0;
		if (funcionarios >= 10) {
			imposto = renda * 0.14;
		} else {
			imposto = renda * 0.16;
		}
		return imposto;
	}

}
