package oop2;

public class Main {

	public static void main(String[] args) {
		// CorporateCustomer corporateCustomer1 = new CorporateCustomer();
		// corporateCustomer1.setCompanyName("Turkcell");

		// IndividualCustomer individualCustomer1 = new IndividualCustomer();
		// individualCustomer1.setFirstName("Nafiye");

		// IndividualCustomer[] individualCustomers = {corporateCustomer1} ekleyemeyiz.

		CorporateCustomer corporateCustomer1 = new CorporateCustomer(1, "Turkcell", "12345", "123",
				"info@turkcell.com.tr");

		IndividualCustomer individualCustomer1 = new IndividualCustomer(2, "Nafiye", "Demiroð", "12345", "653",
				"nafiye@gmail.com");

		Customer[] customers = { corporateCustomer1, individualCustomer1 };

		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager();
		individualCustomerManager.add(individualCustomer1);

	}
}
