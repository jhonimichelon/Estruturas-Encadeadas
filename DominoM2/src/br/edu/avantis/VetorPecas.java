package br.edu.avantis;

public class VetorPecas {

	public static void preenche(int[][] vetor) {
		int cont=0;
		for (int i = 0; i < 7; i++) {
			for (int j = i; j < 7; j++) {
				vetor[cont][0] = i;
				vetor[cont][1] = j;
				cont++;
			}
		}
	}
	
	public static void mostrar(int[][] vetor) {
		for(int i=0; i<28; i++) {
			System.out.print("|");
			for(int j=0; j<2; j++) {
				System.out.print(vetor[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] vetor = new int[28][2];

		preenche(vetor);
		mostrar(vetor);
	}

}
