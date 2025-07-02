package entities;

public class Sedan extends Veiculo {

	public Sedan() {
		super();
	}

	public Sedan(String placa, String modelo) {
		super(placa, modelo, TipoVeiculo.SEDAN);
	}

	@Override
	public double calcularDiaria() {
		return 200;
	}
}
