package entities;

public class CarroPequeno extends Veiculo {
	


	public CarroPequeno(String placa, String modelo) {
		super(placa, modelo, TipoVeiculo.PEQUENO);
	}

	@Override
	public double calcularDiaria() {
		return 100;
	}
}
