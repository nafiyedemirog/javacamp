package oop1;

public class Main {

	public static void main(String[] args) {
		String name = "Nafiye Demiroð";
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("GSM");

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("iPhone 12");
		product1.setUnitPrice(12000);
		product1.setDiscount(1500);
		product1.setImages(new String[] { "image1.jpg", "image2.jpg", "image3.jpg" });
		// product.discountedPrice = product.unitPrice - product.discount;
		System.out.println(product1.getDiscountedPrice());
		product1.setCategory(category1);

		Product product2 = new Product(2, "iPhone 13", 12000, 1500,
				new String[] { "image1.jpg", "image2.jpg", "image3.jpg" });
		product2.setCategory(category1);

		Product product3 = new Product();
		product3.setId(1);
		product3.setName("iPhone 14");
		product3.setUnitPrice(12000);
		product3.setDiscount(1500);
		product3.setImages(new String[] { "image1.jpg", "image2.jpg", "image3.jpg" });
		// product.discountedPrice = product.unitPrice - product.discount;
		System.out.println(product1.getDiscountedPrice());
		product3.setCategory(category1);

		String[] productNames = { "X" };

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDiscount());
			System.out.println(product.getDiscountedPrice());
			System.out.println("-----------");
		}

	}

}
