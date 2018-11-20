package br.edu.avantis;

public class Lista {

	public Peca comeco;
	public Peca fim;

	public void adiciona(int valor1, int valor2) {
		Peca peca = new Peca(valor1, valor2);

		if (comeco == null) {
			comeco = peca;
			fim = peca;
		} else {
			peca.eloDireita = comeco;
			comeco.eloEsquerda = peca;
			comeco = peca;
		}

	}
	
	public void mostrar() {
		Peca peca = this.comeco;
		while(peca != null) {
			System.out.println(peca.valor1 + " " + peca.valor2);
			peca= peca.eloDireita;
		}
	}
	
	public void buscar(int valor1, int valor2) {
		Peca peca = this.comeco;
		while(peca != null) {
			if(peca.valor1 == valor1 && peca.valor2== valor2) {
				System.out.println(peca.valor1 + "|" + peca.valor2);
				peca = peca.eloDireita;
			}
		}
	}

}
