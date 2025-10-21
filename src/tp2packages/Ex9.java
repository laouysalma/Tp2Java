package tp2packages;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez la taille n de la matrice carrée : ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Entrez les éléments de la matrice (n x n) :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {
            sommePrincipale += mat[i][i];           
            sommeSecondaire += mat[i][n - 1 - i];   
        }

        int diff = Math.abs(sommePrincipale - sommeSecondaire);
        System.out.println("Différence absolue : " + diff);

        sc.close();
    }
}
