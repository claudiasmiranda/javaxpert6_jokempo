package jokempo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Jokempo {

	public static void main(String[] args) {
		String nomeDoJogador;
		int opcaoDoJogador;
		Scanner leitor = new Scanner(System.in);
		int minimoValor = 1;
		int maximoValor = 3;
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int numeroRandomizado = tlr.nextInt(maximoValor, maximoValor + 1);

		System.out.println("Qual o seu nome?");
		nomeDoJogador = leitor.nextLine();
		System.out.println("Seja bem vindo ao JOGO de JOKEMPO, " + nomeDoJogador);

		System.out.println("-----------------------------------------------");
		System.out.println("                  JOKEMPO                      ");
		System.out.println("-----------------------------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("-----------------------------------------------");

		System.out.println("Digite a sua op��o, " + nomeDoJogador + "?");
		opcaoDoJogador = leitor.nextInt();

		if (opcaoDoJogador == 1) {
			System.out.println("Voc� escolheu PEDRA.\n");
		} else if (opcaoDoJogador == 2) {
			System.out.println("Voc� escolheu PAPEL.\n");
		} else if (opcaoDoJogador == 3) {
			System.out.println("Voc� escolheu TESOURA.\n");
		} else 
			System.out.println("Essa n�o � uma op��o v�lida.\n");
				
		System.out.println("A op��o do computador foi: " + numeroRandomizado + "\n");

		if (numeroRandomizado == 1) {
			System.out.println("O computador escolheu PEDRA.\n");
		} else if (numeroRandomizado == 2) {
			System.out.println("O computador escolheu PAPEL.\n");
		} else if (numeroRandomizado == 3) {
			System.out.println("O computador escolheu TESOURA.\n");

			if (opcaoDoJogador == 1 && numeroRandomizado == 1 || opcaoDoJogador == 2 && numeroRandomizado == 2 || opcaoDoJogador == 3 && numeroRandomizado == 3) {
				System.out.println("EMPATOU! Tente de novo.");
			} else if (opcaoDoJogador == 1 && numeroRandomizado == 2 || opcaoDoJogador == 2 && numeroRandomizado == 1 || opcaoDoJogador == 2 && numeroRandomizado == 3 || opcaoDoJogador == 3 && numeroRandomizado == 1) {
				System.out.println("Voc� PERDEU!");
			} else if (opcaoDoJogador == 1 && numeroRandomizado == 3 || opcaoDoJogador == 3 && numeroRandomizado == 2) {
				System.out.println("Voc� GANHOU! Parab�ns!");
			} else if (opcaoDoJogador != 1 || opcaoDoJogador != 2 || opcaoDoJogador != 3 && numeroRandomizado == 1 || numeroRandomizado == 2 || numeroRandomizado == 3)  {
				System.out.println("A sua escolha foi INV�LIDA. Voc� PERDEU!");
			}
			leitor.close();

		}

	}
}
