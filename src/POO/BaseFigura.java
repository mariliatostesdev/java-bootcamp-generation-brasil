package POO;

public class BaseFigura {
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	public BaseFigura(double lado1, double lado2, String nome) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

	public double getArea() {
		// tem na interface
		return lado1 * lado2;
	}
	public double getPerimetro() {
		// tem na interface
		return (lado1 + lado2) * 2.0;
	};

	
}
