package one.digitalinnovationone.quinto;

public class Calculadora implements OperacaoMatematica {

	@Override
	public void soma(int num1, int num2) {
		System.out.println("O resultado da soma �: " + (num1 + num2));
	}

	@Override
	public void subtracao(int num1, int num2) {
		System.out.println("O resultado da subtra��o �: " + (num1 - num2));
	}

	@Override
	public void divisao(int num1, int num2) {
		System.out.println("O resultado da divis�o �: " + (num1 / num2)); 
	}

	@Override
	public void multiplicacao(int num1, int num2) {
		System.out.println("O resultado da multiplica��o �: " + (num1 * num2));
	}

}
