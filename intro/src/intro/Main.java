package intro;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		String internetSubeButonu = "�nternet �ubesi";
//
//		double dolarDun = 8.20;
//
//		double dolarBugun = 8.20;
//
//		int vade = 36;
//
//		boolean dustuMu = false;
//
//		System.out.println(internetSubeButonu);
//
//		if (dolarDun > dolarBugun) {
//			System.out.println("Dolar d��t� resmi");
//		} else if (dolarDun < dolarBugun) {
//			System.out.println("Dolar y�kseldi resmi");
//		}
//		else {
//			System.out.println("Dolar e�ittir resmi");
//		}
//
//		String kredi1 = "H�zl� Kredi";
//		String kredi2 = "Mutlu Emekli Kredisi";
//		String kredi3 = "Konut Kredisi";
//		String kredi4 = "�ift�i Kredisi";
//		String kredi5 = "Msb Kredisi";
//
//		String[] krediler = {};

		// primitive type
//		String productName = "Iphone12";
//		double unitPrice = 12000;
//		double discount = 1500;
//		double discountedPrice = 10500;
//		int unitsInStock = 49;
//		boolean isLoggedIn = true;
//
//		if (isLoggedIn) {
//			System.out.println("Ho�geldiniz!");
//		} else {
//			System.out.println("Giri� yap");
//		}
//
//		if (unitsInStock < 50) {
//			System.out.println("Stok azal�yor");
//		} else if (unitsInStock >= 50 && unitsInStock < 100) {
//			System.out.println("Stok normal");
//		} else {
//			System.out.println("Stok gere�inden fazla");
//		}
//	}
//	
//	String[] productName = {"iPhone 12", "Samsung 15", "Apple Watch"};
//	
//	for(String name : productName) {
//		System.out.println(name);
//	}
//	

		List<Integer> superSayi = new ArrayList<Integer>();
		int toplam = 0;
		int sayac = 0;
		int sayi = 2;
		while (true) {
			if (superSayi.size() >= 5) {
				break;
			}
			for (int i = 1; i < sayi; i++) {

				if (sayi % i == 0) {
					toplam = toplam + i;

				}

			}

			if (toplam == sayi) {
				superSayi.add(sayi);
				System.out.println(sayi);
			}
			toplam = 0;
			sayi++;
		}
		System.out.println(superSayi);

	}
}
