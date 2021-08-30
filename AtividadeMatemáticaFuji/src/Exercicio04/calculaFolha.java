package Exercicio04;

import java.util.Scanner;

public class calculaFolha {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Func funcionario = new Func(); 
		String entrada = null;		
		while(entrada != "fim") {
			System.out.println("Insira o valor de seu salario ou digite 'fim' para finalizar o programa: ");
			entrada = leitor.nextLine();
			
			if(entrada.equals("fim")) {
				entrada = "fim";
				System.out.println("Fim do programa");
			} else {
				try {
					Float valorSalario = Float.valueOf((String) entrada);
					Float salarioFim = funcionario.calculaAumento(valorSalario);
				
					if(salarioFim == valorSalario) {
						System.out.println("Você não tem acesso ao aumento");
					} else {
						System.out.println("Salario com aumento: R$"+salarioFim);
					}
				} catch (Exception e) {
					System.out.println("Valor inserido invalido, tente novamente.");
				}
			}
		}
		
	}
}
