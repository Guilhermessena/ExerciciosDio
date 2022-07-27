package one.digitalinnovationone.primeiro;

public class CarroMain {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setCor("Preto");
		carro.setModelo("Corsa");
		carro.setCapacidadeTanque(20);

		System.out.println("O " + carro.getModelo() + " da cor " + carro.getCor() + " tem uma capacidade de "
				+ carro.getCapacidadeTanque() + "litros");

		System.out.print(carro.valorTotalTanque(5.39));

	}

}
