package lista09;

import java.util.Scanner;

public class Lista09Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int tabuada = 1;
		
		
		do {
			System.out.println(numero + " x " + tabuada + " = " + (numero * tabuada));
			tabuada++;
		}
		
		while(tabuada < 11);
	
		sc.close();
	}
}
