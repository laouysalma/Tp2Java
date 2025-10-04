package tp2packages;
import java.util.Scanner;

public class Ex10 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] mat = new int[3][3];

	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                mat[i][j] = sc.nextInt();

	        int somme = mat[0][0] + mat[0][1] + mat[0][2];
	        boolean magique = true;

	        for (int i = 0; i < 3; i++) {
	            int s1 = mat[i][0] + mat[i][1] + mat[i][2];
	            int s2 = mat[0][i] + mat[1][i] + mat[2][i];
	            if (s1 != somme || s2 != somme) magique = false;
	        }

	        int diag1 = mat[0][0] + mat[1][1] + mat[2][2];
	        int diag2 = mat[0][2] + mat[1][1] + mat[2][0];
	        if (diag1 != somme || diag2 != somme) magique = false;

	        if (magique) System.out.println("Magique");
	        else System.out.println("Pas magique");
	    }
	}

