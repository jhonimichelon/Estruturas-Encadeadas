package br.edu.avantis;

public class Lista {
	public No comeco, fim;

	public boolean vazia() {
		if (comeco == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void inicializar() {
		comeco = null;
		fim = null;
	}
}
