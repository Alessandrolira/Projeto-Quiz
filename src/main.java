import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Perguntas questao1 = new Perguntas("A terra � plana?","Sim", "N�o", "Com certeza n�o", 1);
		
		System.out.println(questao1.getPergunta());
		System.out.println("���  " + questao1.getPrimeiraAlternativa());
		System.out.println("���  " + questao1.getSegundaAlternativa());
		System.out.println("���  " + questao1.getTerceiraAlternativa());
		
		Scanner entrada = new Scanner(System.in);
		int palpite = entrada.nextInt();
		entrada.close();
		
		if (palpite == questao1.resposta) {
			System.out.println("PARAB�NS!!, Voc� acertou");;
		}else {
			System.out.println("infelizmente voc� errou!");;
		}
		
	}

}
