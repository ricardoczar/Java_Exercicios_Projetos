package entities;

public class SUV extends Veiculo {
	
	
	public SUV() {
		super();
	}

	public SUV(String placa, String modelo) {
		super(placa, modelo, TipoVeiculo.SUV);
	}

	@Override
	public double calcularDiaria() {
		return 300;
	}
}
