package Optional;

public class Colaborador {

	private Long id; // Duplica o tamanho do int
	private String nome;
	private Float salario;
	
	public Colaborador(Long id, String nome, Float salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Colaborador(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
