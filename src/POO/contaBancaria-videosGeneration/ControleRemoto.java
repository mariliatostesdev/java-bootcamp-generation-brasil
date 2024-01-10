package POO.contaBancaria.videosGeneration;

public class ControleRemoto {
	
	public String controlar(String tipo, boolean paraquedas) {
		return "Estamos decolando para fora da atmosfera";
	}
	
	public String controlar(String tipo, boolean sinalizador, boolean boia) {
		return "Vamos navegar, segurem firme!";
	}
	
	public String controlar(String tipo) {
		return "Apertem os cintos, o carro já vai pegar a estrada!";
	}
	

}
