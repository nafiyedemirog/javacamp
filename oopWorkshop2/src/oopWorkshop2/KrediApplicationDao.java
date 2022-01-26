package oopWorkshop2;

public interface KrediApplicationDao {
	void add(KrediApplication krediApplication, int amount);

	void update(KrediApplication krediApplication, int amount);

	void delete(KrediApplication krediApplication);
}
