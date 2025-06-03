package lista09;

import java.util.Scanner;

public class Lista09Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contadora = 0;
		int numero;
		
		do {
			System.out.println("Digite numero positivo: ");
			numero = sc.nextInt();
		
			if(numero >= 0) {
				contadora += numero;				
			}
		}while(numero >= 0);
				System.out.println("A soma dos numeros digitados é: " +contadora);
		
		sc.close();
	}
}
