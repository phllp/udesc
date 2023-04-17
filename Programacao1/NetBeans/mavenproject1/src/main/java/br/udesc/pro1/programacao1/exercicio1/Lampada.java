package br.udesc.pro1.programacao1.exercicio1;

public class Lampada {
	
	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void observar() {
		if (this.ligada) {
			System.out.println("A l�mpada est� ligada");
		} else {
			System.out.println("A l�mpada est� desligada");
		}
	}
	
	
}
