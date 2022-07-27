package one.digitalinnovationone.quinto;

public class Calculadora implements OperacaoMatematica {

	@Override
	public void soma(int num1, int num2) {
		System.out.println("O resultado da soma é: " + (num1 + num2));
	}

	@Override
	public void subtracao(int num1, int num2) {
		System.out.println("O resultado da subtração é: " + (num1 - num2));
	}

	@Override
	public void divisao(int num1, int num2) {
		System.out.println("O resultado da divisão é: " + (num1 / num2)); 
	}

	@Override
	public void multiplicacao(int num1, int num2) {
		System.out.println("O resultado da multiplicação é: " + (num1 * num2));
	}

}
