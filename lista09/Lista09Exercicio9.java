package lista09;

import java.util.Scanner;

public class Lista09Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int senhaCorreta = 1234;
	     int tentativa;

	        do {
	            System.out.print("Digite a senha: ");
	            tentativa = sc.nextInt();

	            if (tentativa != senhaCorreta) {
	                System.out.println("Senha incorreta! Tente novamente.");
	            }

	        } while (tentativa != senhaCorreta);

	        System.out.println("Senha correta! Acesso permitido.");
        
		sc.close();
	}
}

