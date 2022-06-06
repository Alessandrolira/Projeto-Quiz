
public class Perguntas {
	public String pergunta;
	public String primeiraAlternativa;
	public String segundaAlternativa;
	public String terceiraAlternativa;
	public int resposta;

	public Perguntas (String pergunta, String primeiraAlternativa, String segundaAlternativa, String terceiraAlternativa, int resposta) {
		this.pergunta = pergunta;
		this.primeiraAlternativa = primeiraAlternativa;
		this.segundaAlternativa = segundaAlternativa;
		this.terceiraAlternativa = terceiraAlternativa;
		this.resposta = resposta;
		return;
	}
	
	public String getPergunta(){
		return this.pergunta;
	}
	
	public String getPrimeiraAlternativa() {
		return this.primeiraAlternativa;
	}
	
	public String getSegundaAlternativa() {
		return this.segundaAlternativa;
	}
	
	public String getTerceiraAlternativa() {
		return this.terceiraAlternativa;
	}
	
	
}
