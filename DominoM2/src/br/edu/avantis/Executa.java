package br.edu.avantis;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista listaInicial = new Lista();
		Lista jogador1 = new Lista();
		Lista jogador2 = new Lista();
		Lista tabuleiro = new Lista();
		
		Peca peca = new Peca(0, 0);
		
		listaInicial.adiciona(6, 1);
		listaInicial.adiciona(1, 2);
		listaInicial.adiciona(2, 2);

		peca = listaInicial.retirar();
		jogador1.adiciona(listaInicial.fim.valor1, listaInicial.fim.valor2);
		jogador1.adiciona(listaInicial.comeco.valor1, listaInicial.comeco.valor2);

		System.out.println(listaInicial.comeco.valor1 + " " + listaInicial.comeco.valor2);
		System.out.println(listaInicial.fim.valor1 + " " + listaInicial.fim.valor2);
		System.out.println(listaInicial.fim.eloEsquerda.valor1 + " " + listaInicial.fim.eloEsquerda.valor2);

		System.out.println();
		listaInicial.mostrar();
		System.out.println();
		listaInicial.buscar(2, 2);
		System.out.println();
		jogador1.mostrar();
	}

}
