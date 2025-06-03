package lista09;

import java.util.Scanner;

public class Lista09Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		int soma = 0;
		int quantidade = 0;
		
		do {
			System.out.println("Digite sua nota de (0 a 10)");
			nota = sc.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				soma += nota;
				quantidade++;
			}
		}while(nota >= 0 && nota <= 20);
		
			if(quantidade > 0) {
				double media = soma/quantidade;
				System.out.println("Sua média é: " +media );
			}
		
		
		sc.close();
	}
}
