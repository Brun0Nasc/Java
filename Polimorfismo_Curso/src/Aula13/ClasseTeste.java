package Aula13;

public class ClasseTeste {
	public static void main(String[] args) {
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		
		l.emitirSom();
		c.emitirSom();
		
		c.reagir("mal");
		c.reagir("bom");
		c.reagir(12);
		c.reagir(0);
		c.reagir(22);
	}
}
