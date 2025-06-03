package lista09;

import java.util.Scanner;

public class Lista09Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        int num = numero;

        do {
            fatorial *= num;
            num--;
        } while (num > 0);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        
		sc.close();
	}
}

