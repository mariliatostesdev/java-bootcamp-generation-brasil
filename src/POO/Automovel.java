package POO;

public class Automovel {

	// 1ª etapa: declaração dos atributos da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// vamos criar o método construtor (p/ podermos criar objetos a partir da classe?)
	// (Source -> Generate Constructor using fields)
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	// posso criar vários construtores se eu quiser.
	// por ex: que só pegue o nomeProprietario e o modelo:
	public Automovel(String nomeProprietario, String modelo) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
	}

	// vamos criar os métodos get e set a partir dos atributos
	// getNomeProprietario, getModelo, getPlaca, getAno...
	// (Source -> Generate Getters and Setters)

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// vamos criar nosso próprio método imprimirInfo
	public void imprimirInfo() {
		System.out.println("\n" + nomeProprietario + " possui um veículo modelo: " + modelo + " com placa: " + placa
				+ " e ano: " + ano);
	}

}
