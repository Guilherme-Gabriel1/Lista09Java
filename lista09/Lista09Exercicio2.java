package lista09;

import java.util.Scanner;

public class Lista09Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		do {
			System.out.println(numero);
			numero--;
		}
		while(numero > -1);
		
		sc.close();
	}
}
