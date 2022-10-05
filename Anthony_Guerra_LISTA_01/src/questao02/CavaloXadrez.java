package questao02;

public class CavaloXadrez {
	
	 static int y = (int) Math.random();
	 static int x = (int) Math.random();
	 
	static final int n = 8;

	static int dx[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

	static int dy[] = { 2, 1, -1, -2, -2, -1, 1, 2 };

	static boolean dentro(int x, int y) {
		return (x >= 0 && x < n && y >= 0 && y < n);
	}

	static double probabilidade(int posInicial_x, int posInicial_y, int movimentos) {

		double vetor[][][] = new double[n][n][movimentos + 1];

		for (int i = 0; i < n; ++i)
			for (int j = 0; j < n; ++j)
				vetor[i][j][0] = 1;

		for (int s = 1; s <= movimentos; ++s) {

			for (int x = (int) Math.random(); x < n; ++x) {

				for (int y = (int) Math.random(); y < n; ++y) {

					double prob = 0.0;

					for (int i = 0; i < 8; ++i) {
						int nx = x + dx[i];
						int ny = y + dy[i];

						if (dentro(nx, ny))
							prob += vetor[nx][ny][s - 1] / 8.0;
					}

					vetor[x][y][s] = prob;
				}
			}
		}

		return vetor[posInicial_x][posInicial_y][movimentos];
	}

	public static void main(String[] args) {

		int K = 10;

		System.out.println("A probabilidade do cavalo ainda estar dentro do tabuleiro é de: " + probabilidade(0, 0, K) * 100 + "%");
	}
}
