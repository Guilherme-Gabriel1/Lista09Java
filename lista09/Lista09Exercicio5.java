package lista09;

import java.util.Scanner;

public class Lista09Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		do {
			System.out.println(numero);
			numero += 2;
		}while(numero < 21);
		
		sc.close();
	}
}
