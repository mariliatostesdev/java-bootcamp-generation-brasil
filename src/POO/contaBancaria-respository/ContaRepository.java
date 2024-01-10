package POO.respository;

import POO.contaBancaria.videosGeneration.ContaBancaria;

public interface ContaRepository {

	public void procurarPorNumero(int numero);
	
	// CRUD de conta (Create, Read, Update, Delete)
	public void cadastrar(ContaBancaria conta);
	public void listarTodas();
	public void atualizar(ContaBancaria conta);
	public void deletar(ContaBancaria conta);
	
	// Métodos bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);

}
