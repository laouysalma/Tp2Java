package tp2packages;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez la taille du tableau : ");
        int n = sc.nextInt();

        int[] t = new int[n];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        int maxSoFar = t[0];
        int maxEndingHere = t[0];

        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(t[i], maxEndingHere + t[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("La somme maximale est : " + maxSoFar);
        sc.close();
    }
}
