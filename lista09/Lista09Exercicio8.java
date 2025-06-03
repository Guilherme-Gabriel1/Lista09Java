package lista09;

import java.util.Scanner;

public class Lista09Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra;

        do {
            System.out.print("Digite uma palavra ou digite 'sair' para encerrar: ");
            palavra = sc.next();

            if (palavra != "sair") {
                int contador = 0;

                for (int i = 0; i < palavra.length(); i++) {
                    char letra = palavra.charAt(i);
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        contador++;
                    }
                }

                System.out.println("A palavra " + palavra + " tem " + contador + " vogais.");
            }else if(palavra == "sair") {
            	System.out.println("Programa encerrado!");
            }
        }
            while(palavra != "sair");
        	
            	
            
        
		sc.close();
	}
}

