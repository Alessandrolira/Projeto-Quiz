import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Perguntas questao1 = new Perguntas("A terra é plana?","Sim", "Não", "Com certeza não", 1);
		
		System.out.println(questao1.getPergunta());
		System.out.println("°°°  " + questao1.getPrimeiraAlternativa());
		System.out.println("°°°  " + questao1.getSegundaAlternativa());
		System.out.println("°°°  " + questao1.getTerceiraAlternativa());
		
		Scanner entrada = new Scanner(System.in);
		int palpite = entrada.nextInt();
		entrada.close();
		
		if (palpite == questao1.resposta) {
			System.out.println("PARABÉNS!!, Você acertou");;
		}else {
			System.out.println("infelizmente você errou!");;
		}
		
	}

}
