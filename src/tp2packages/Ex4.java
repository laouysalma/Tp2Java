package tp2packages;

public class Ex4 {

	public static void main(String[] args) {

		int[][] matrice = { { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 0 } };

		int lignes = matrice.length;
		int colonnes = matrice[0].length;

		int maxAire = 0;
		int meilleurHaut = 0, meilleurGauche = 0, meilleurBas = 0, meilleurDroite = 0;

		for (int i = 0; i < lignes; i++) {
			for (int j = 0; j < colonnes; j++) {
				if (matrice[i][j] == 1) {
					for (int bas = i; bas < lignes; bas++) {
						for (int droite = j; droite < colonnes; droite++) {
							if (estRectangleDe1(matrice, i, j, bas, droite)) {
								int aire = (bas - i + 1) * (droite - j + 1);
								if (aire > maxAire) {
									maxAire = aire;
									meilleurHaut = i;
									meilleurGauche = j;
									meilleurBas = bas;
									meilleurDroite = droite;
								}
							}
						}
					}
				}
			}
		}

		if (maxAire > 0) {
			System.out.println("Plus grand rectangle de 1 trouvé :");
			System.out.println("Coin haut-gauche : (" + meilleurHaut + ", " + meilleurGauche + ")");
			System.out.println("Coin bas-droite  : (" + meilleurBas + ", " + meilleurDroite + ")");
			System.out.println("Aire = " + maxAire);
		} else {
			System.out.println("Aucun rectangle de 1 trouvé.");
		}
	}

	public static boolean estRectangleDe1(int[][] matrice, int haut, int gauche, int bas, int droite) {
		for (int i = haut; i <= bas; i++) {
			for (int j = gauche; j <= droite; j++) {
				if (matrice[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
