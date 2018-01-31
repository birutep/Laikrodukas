package vtvpmc.emc.lt.bp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Laikrodis laikrodis = new Laikrodis();
		Kampas kampas = new Kampas(laikrodis);
		double userVal;
		double userMin;
			
		while (true){
			
			System.out.println("Nustatykime laikrodi.");
			
			try {
				System.out.print("Ivesk valandas (1-12): ");
				userVal = sc.nextDouble();
				System.out.print("Ivesk minutes (0-59): ");
				userMin = sc.nextDouble();
				laikrodis.setVal(userVal);
				laikrodis.setMin(userMin);
				break;
			}
			catch (IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			catch (InputMismatchException e)
			{
			    System.out.println("Gali ávesti tik skaièius. Gal pirðtas nuslydo... Pabandyk dar kartà.");
			    sc.next();
			}
		}

		sc.close();
		kampas.skaiciuotiKampa();
		System.out.println(kampas);
	}

}
