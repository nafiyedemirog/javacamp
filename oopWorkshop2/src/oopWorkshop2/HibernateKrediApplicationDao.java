package oopWorkshop2;

public class HibernateKrediApplicationDao implements KrediApplicationDao {

	@Override
	public void add(KrediApplication krediApplication, int amount) {
		System.out.println("Hibernate eklendi : " + krediApplication.getKredi().getName());

	}

	@Override
	public void update(KrediApplication krediApplication, int amount) {
		System.out.println("Hibernate güncellendi : " + krediApplication.getKredi().getName());

	}

	@Override
	public void delete(KrediApplication krediApplication) {
		System.out.println("Hibernate silindi : " + krediApplication.getKredi().getName());

	}

}
