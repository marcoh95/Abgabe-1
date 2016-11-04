package de.unistuttgart.iaas.pse.ex01.p1;

/**
 * 	PSE Aufgabenblatt 1
 * 
 * @author Laura Sophie Bertsch (3227725)
 * @author Marco Haas (3142635)
 * @author Andreas Seibert (3228669)
 * 
 * @version 1.0
 * 
 *          This class computes serveral Numbers
 */

public class Loops {
	/**
	 * Errechnet die Eulersche Zahl bis zum angegebenen Reihenglied
	 * 
	 * @param n
	 * @return
	 */
	public static double computeEuler(int n) {
		double euler;
		if (n == 0) {
			euler = 1.0;
		} else if (n == 1) {
			euler = 2.0;
		} else {
			euler = ((1 / computeFakultät(n)) + computeEuler(n - 1));
		}
		return euler;
	}

	/**
	 * Errechet aufsteigend die Reihenglieder der Eulerschen Zahl bis ein
	 * Reihenglied kleiner ist als der übergebene Parameter.
	 * 
	 * @param delta
	 * @return
	 */
	public static double computeEuler(double delta) {
		double euler = 0;
		int i = 0;
		while (true) {
			euler = 1 / computeFakultät(i);
			if (euler < delta) {
				return euler;
			}
			i++;
		}
	}

	/**
	 * Berechet die Fakultät einer übergeben Zahl ∈ N
	 * 
	 * @param f
	 * @return
	 */
	public static double computeFakultät(int f) {
		if ((f == 1) || (f == 0)) {
			return 1.0;
		}
		return f * computeFakultät(f - 1);
	}

	/**
	 * Berechnet die Quersumme einer übergebenen natürlichen Zahl
	 * 
	 * @param n
	 * @return die Quersumme der übergebenen Zahl
	 */
	public static int crossSum(int n) {
		if (n < 0) {
			System.out.println("Die übergebene Zahl ist kein Element der natürlichen Zahlen");
			return 0;
		}
		int value = 0;
		String initNumber = String.valueOf(n);
		for (int i = 0; i < initNumber.length(); i++) {
			String s1 = initNumber.substring(i, i + 1);
			value = value + Integer.parseInt(s1);
		}
		return value;
	}

	public static void main(String[] args) {
		// to test
		System.out.println("50 steps: \n" + computeEuler(50));
		System.out.println("Until a divergence of 0.00000001: \n" + computeEuler(0.00000001));
		System.out.println("Sum of the Digits: \n" + crossSum(123));
	}

}
