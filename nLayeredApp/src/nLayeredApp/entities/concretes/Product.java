package nLayeredApp.entities.concretes;

import nLayeredApp.entities.abstracts.Entity;

public class Product extends Entity {
	private int id;
	private String name;
	private double unitPrice;
	private double discount;
	private String[] images;

	public Product() {

	}

	public Product(int id, String name, double unitPrice, double discount, String[] images) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public double getDiscountedPrice() {
		return this.unitPrice - this.discount;
	}
}
