package Exercicio02;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int cont=0;
		while (cont < 10) {
			cont++;
			System.out.println("Informe o n�mero para ser testar: ");
			int num = leitor.nextInt();
			
			if(num%2 == 0) {
				System.out.println("Este n�mero � par");
			}else {
				System.out.println("Este n�mero � impar");
			}
			
		} 
		
	}
	
	
}
