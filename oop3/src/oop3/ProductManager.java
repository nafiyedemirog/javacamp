package oop3;

public class ProductManager {
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) {
		// i� kural� kodlar�
		// �r�n ismi tekrar edemez
		// �r�n fiyat� 0'dan k���k olamaz

		// i� kurallar�ndan ge�erse
		this.productDao.add(product);

	}

	public void update(Product product) {
		this.productDao.update(product);
	}

	public void delete(Product product) {
		this.productDao.delete(product);
	}

}
