package br.edu.avantis;

public class Lista {
	public No comeco;

	public boolean vazia() {
		if (comeco == null) {
			return true;
		} else {
			return false;
		}
	}

	public No pesquisar(char valor) {
		No aux = comeco;
		while (aux != null) {
			if (valor == aux.info) {
				return aux;
			}

			aux = aux.elo;
		}
		return null;
	}

	public void mostrar() {
		No aux;
		aux = comeco;
		while (aux != null) {
			System.out.println(aux.info + " ");
			aux = aux.elo;
		}
	}

	public void inicializar() {
		comeco = null;
	}

	public boolean inserir(char valor) {
		No novo = new No(valor);

		if (comeco == null) {
			comeco = novo;
			return true;
		}

		if (valor < comeco.info) {
			novo.elo = comeco;
			comeco = novo;
			return true;
		}

		No aux, prox;
		aux = comeco;

		while (aux != null) {
			prox = aux.elo;
			if (prox == null) {
				aux.elo = novo;
				return true;
			}
			if (valor > aux.info && valor < prox.info) {
				novo.elo = prox;
				aux.elo = novo;
				return true;
			}
			aux = aux.elo;
		}
		return false;
	}
}
