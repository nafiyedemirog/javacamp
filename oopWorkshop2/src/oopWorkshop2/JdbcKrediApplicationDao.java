package oopWorkshop2;

public class JdbcKrediApplicationDao implements KrediApplicationDao {

	@Override
	public void add(KrediApplication krediApplication, int amount) {
		System.out.println("Jdbc eklendi : " + krediApplication.getKredi().getName());

	}

	@Override
	public void update(KrediApplication krediApplication, int amount) {
		System.out.println("Jdbc güncellendi : " + krediApplication.getKredi().getName());

	}

	@Override
	public void delete(KrediApplication krediApplication) {
		System.out.println("Jdbc silindi : " + krediApplication.getKredi().getName());

	}

}
