package Aula13;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void reagir(String frase) {
		if(frase.equals("bom")) {
			System.out.println("abana rabo");
		} else {
			System.out.println("rosna");
		}
	}
	
	public void reagir(int hora) {
		if(hora >= 0 && hora<= 6) {
			System.out.println("Cachorro ficou bravo, vc acordou ele");
		} else if(hora > 6 && hora <= 21) {
			System.out.println("Cachorro ta de boa, quer brincar com vc");
		} else {
			System.out.println("Cachorro ta com sono, fez nada não");
		}
	}
}
