package Aula12;

public class Peixe extends Animal {
	
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltando bolhas");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo coisas de peixe");		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som");		
	}

}
