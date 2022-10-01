package tiposlacos;

import java.util.Iterator;

public class lacofatorial {
public static void main(String[] args) {
	int aux = 1;
	for (int i = 1; i <= 10; i++) {
		System.out.print("Fatorial de "+i+" => ");
		for(int j=1;j<=i;j++) {
			System.out.print(j+"x");
			aux = aux * j ;
		}
		System.out.println("= "+aux);
	}
}
}
