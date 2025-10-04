package tp2packages;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez n: ");
        int n = sc.nextInt();

        int[] t = new int[n];
        System.out.println("Donnez les elements du tableau:");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        boolean[] vu = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (t[i] < 1 || t[i] > n) {
                System.out.println("Ce n'est PAS une permutation circulaire");
                return;
            }
            if (vu[t[i]]) {
                System.out.println("Ce n'est PAS une permutation circulaire");
                return;
            }
            vu[t[i]] = true;
        }

        System.out.println("C'est une permutation circulaire !");
    }
}
