package oopWorkshop2;

public class KrediApplication {
	private int id;
	private Customer customer;
	private Kredi kredi;

	public KrediApplication() {
		super();
	}

	public KrediApplication(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Kredi getKredi() {
		return kredi;
	}

	public void setKredi(Kredi kredi) {
		this.kredi = kredi;
	}
}
