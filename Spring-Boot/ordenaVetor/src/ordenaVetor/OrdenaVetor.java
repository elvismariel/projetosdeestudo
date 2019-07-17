package ordenaVetor;

public class OrdenaVetor {

	public static void main(String[] args) {
		int[] vetor = new int[] { 3, 2, 4, 5, 1, 6, 7, 2, 2, 10, 18, 2, 45, 88, 6, 3, 42, 22, 34, 26, 13 };
		boolean ordena = true;

		while (ordena) {
			ordena = false;
			for (int i = 1; i < vetor.length; i++) {
				if (vetor[i - 1] > vetor[i]) {
					int vlrAtual = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = vlrAtual;
					ordena = true;
				}
			}
		}

		for (int valor : vetor) {
			System.out.println(valor + ",");
		}
	}

}
