package tp2packages;
import java.util.Scanner;

public class Ex7 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donnez la taille du tableau: ");
	        int n = sc.nextInt();

	        int[] t = new int[n];
	        System.out.println("Entrez les éléments du tableau:");
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }

	        int majoritaire = trouverMajoritaire(t);
	        System.out.println("Élément majoritaire: " + majoritaire);
	    }

	    public static int trouverMajoritaire(int[] t) {
	        int n = t.length;
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (t[j] == t[i]) {
	                    count++;
	                }
	            }
	            if (count > n / 2) {
	                return t[i];
	            }
	        }
	        return -1;
	    }
	}


