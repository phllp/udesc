package br.udesc.pro1.programacao1.exercicio1;

public class Principal {

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada(true);
		Lampada lamp2 = new Lampada(false);
		
		lamp1.desligar();
		
		lamp1.observar();
		lamp2.observar();
	}

}
