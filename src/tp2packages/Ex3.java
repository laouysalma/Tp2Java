package tp2packages;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez n: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        int val = 1;
        int haut = 0, bas = n - 1;
        int gauche = 0, droite = n - 1;

        while (val <= n * n) {
            for (int j = gauche; j <= droite; j++) {
                mat[haut][j] = val;
                val++;
            }
            haut++;

            for (int i = haut; i <= bas; i++) {
                mat[i][droite] = val;
                val++;
            }
            droite--;

            for (int j = droite; j >= gauche; j--) {
                mat[bas][j] = val;
                val++;
            }
            bas--;

            for (int i = bas; i >= haut; i--) {
                mat[i][gauche] = val;
                val++;
            }
            gauche++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
