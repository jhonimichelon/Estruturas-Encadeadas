package br.edu.avantis;

public class Executa {

	public static void main(String[] args) {
		Lista A = new Lista();
		
		A.inicializar();
		
		A.inserir('P');
		A.inserir('E');
		A.inserir('R');
		A.inserir('N');

		A.mostrar();
		System.out.print("Terminou");
	}

}
