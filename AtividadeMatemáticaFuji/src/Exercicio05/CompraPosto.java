package Exercicio05;

import java.util.Scanner;

public class CompraPosto {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Comprado até o momento: 2 Refrigerantes - 3,00 cada");
		Float valorContaAnterior = (float) 6.00;
		Float valorGasolina = (float) 2.50;
		System.out.println("Total: R$"+valorContaAnterior);
		System.out.println("Insira a quantidade de litros usado para abastecer o veículo: ");
		Float listrosGasolina = leitor.nextFloat();
		System.out.println("Comprado até o momento: 2 Refrigerantes - 3,00 cada");
		System.out.println("Comprado até o momento: "+ listrosGasolina +" L gasolina - 2,50 cada L");
		Float valorTotal = valorContaAnterior + (valorGasolina*listrosGasolina);
		System.out.println("Total final: R$"+ valorTotal);
	}
}
