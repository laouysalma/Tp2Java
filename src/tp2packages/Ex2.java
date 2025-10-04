package tp2packages;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez la taille du tableau: ");
        int n = sc.nextInt();

        int[] t = new int[n];
        System.out.println("Donnez les elements du tableau:");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        System.out.print("Les pivots sont: ");

        for (int i = 0; i < n; i++) {
            boolean estPivot = true;

            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    estPivot = false;
                    break;
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (t[j] < t[i]) {
                    estPivot = false;
                    break;
                }
            }

            if (estPivot) {
                System.out.print(t[i] + " ");
            }
        }

    }
}
