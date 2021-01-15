package testeScanner;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		// Criação do objeto Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaração das variáveis
		String s1, s2, s3;

		// Recebendo valores do teclado
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		// Impressão do resultado
		System.out.println("Dados Digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
