package entities;

public abstract class Veiculo {

	private String placa;
	private String modelo;
	private TipoVeiculo tipo;

	public Veiculo() {

	}

	public Veiculo(String placa, String modelo, TipoVeiculo tipo) {
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}

	public abstract double calcularDiaria();

}
