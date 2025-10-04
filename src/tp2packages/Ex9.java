package tp2packages;
import java.util.Scanner;

public class Ex9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[][] mat = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                mat[i][j] = sc.nextInt();
	            }
	        }

	        int sommePrincipale = 0;
	        int sommeSecondaire = 0;

	        for (int i = 0; i < n; i++) {
	            sommePrincipale += mat[i][i];        // diag principale
	            sommeSecondaire += mat[i][n - 1 - i]; // diag secondaire
	        }

	        int diff = Math.abs(sommePrincipale - sommeSecondaire);
	        System.out.println(diff);
	    }
	}


