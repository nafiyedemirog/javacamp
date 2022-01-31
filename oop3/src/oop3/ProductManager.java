package oop3;

public class ProductManager {
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) {
		// iþ kuralý kodlarý
		// ürün ismi tekrar edemez
		// ürün fiyatý 0'dan küçük olamaz

		// iþ kurallarýndan geçerse
		this.productDao.add(product);

	}

	public void update(Product product) {
		this.productDao.update(product);
	}

	public void delete(Product product) {
		this.productDao.delete(product);
	}

}
