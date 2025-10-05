package tp2packages;
import java.util.Scanner;

public class Ex1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donnez la taille du tableau: ");
	        int n = sc.nextInt();

	        int[] t = new int[n];
	        System.out.println("Donnez les elements du tableau:");
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }

	        int[] lis = new int[n];
	        for (int i = 0; i < n; i++) lis[i] = 1;

	        int max = 1;
	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (t[j] < t[i] && lis[j] + 1 > lis[i]) {
	                    lis[i] = lis[j] + 1;
	                }
	            }
	            if (lis[i] > max) max = lis[i];
	        }

	        System.out.println("La longueur de la plus longue sous-suite croissante est: " + max);
	    }
	}


