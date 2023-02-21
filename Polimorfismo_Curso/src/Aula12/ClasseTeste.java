package Aula12;

public class ClasseTeste {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Mamifero c = new Cachorro();
		Mamifero k = new Canguru();
		
		m.setPeso(5.7);
		m.setIdade(8);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		System.out.println();
		
		k.setPeso(55.3);
		k.setIdade(3);
		k.setMembros(4);
		k.locomover();
		k.alimentar();
		k.emitirSom();
		
		System.out.println();
		
		
	}

}
