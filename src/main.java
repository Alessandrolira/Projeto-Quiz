import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Perguntas questao1 = new Perguntas("A terra � plana?","Sim", "N�o", "Com certeza n�o", 1);
		Perguntas questao2 = new Perguntas("Qual a cor do elefante", "preta", "azul", "cinza", 3);
		
		for(int i = 0; true; i += 1) {
			System.out.println(questao2.getPergunta());
			System.out.println("���  " + questao2.getPrimeiraAlternativa());
			System.out.println("���  " + questao2.getSegundaAlternativa());
			System.out.println("���  " + questao2.getTerceiraAlternativa());
			
			Scanner entrada = new Scanner(System.in);
			int palpite = entrada.nextInt();
			entrada.close();
			
			if (palpite == questao2.resposta) {
				System.out.println("PARAB�NS!!, Voc� acertou");;
				return;
			}else {
				System.out.println("infelizmente voc� errou!");;
				break;
			}
		}
	}

}
