package Exercicio04;

public class Func {
	private float aumento;
	private float salario;
	
	public float getAumento() {
		return aumento;
	}
	
	public void setAumento(float aumento) {
		this.aumento = aumento;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calculaAumento(float salario) {
		if(salario <= 500) {
			float novoSalario = salario + (salario*20/100);
			return novoSalario;
		}
		return salario;
		
	}
	
}
