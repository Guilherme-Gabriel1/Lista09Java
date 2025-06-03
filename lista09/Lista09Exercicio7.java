package lista09;

import java.util.Scanner;

public class Lista09Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 10);
        int palpite;

        do {
            System.out.print("Tente adivinhar o número (entre 1 e 10): ");
            palpite = sc.nextInt();

            if (palpite != random) {
                System.out.println("Errado! Tente novamente.");
            }

        } while (palpite != random);

        System.out.println("Parabéns! Você acertou o número!");

		sc.close();
	}
}
