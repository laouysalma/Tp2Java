package tp2packages;
import java.util.Scanner;

public class Ex8 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] t = new int[n];
	        for (int i = 0; i < n; i++) t[i] = sc.nextInt();

	        boolean[] vu = new boolean[n + 1];
	        for (int x : t) if (x >= 1 && x <= n) vu[x] = true;

	        for (int i = 1; i <= n; i++) if (!vu[i]) System.out.print(i + " ");
	    }
	}

