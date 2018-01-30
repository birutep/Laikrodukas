package vtvpmc.emc.lt.bp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Laikrodis laikrodis = new Laikrodis();
		Kampas kampas = new Kampas(laikrodis);
		double userVal = 0;
		double userMin = 0;
			
		while (true){
			
			System.out.println("Nustatykime laikrodi.");
			System.out.print("Ivesk valandas (1-12): ");
			userVal = sc.nextDouble();
			System.out.print("Ivesk minutes (0-59): ");
			userMin = sc.nextDouble();
			try {
				laikrodis.setVal(userVal);
				laikrodis.setMin(userMin);
				break;
			}
			catch (IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}

		sc.close();
		kampas.skaiciuotiKampa();
		System.out.println(kampas);
	}

}
