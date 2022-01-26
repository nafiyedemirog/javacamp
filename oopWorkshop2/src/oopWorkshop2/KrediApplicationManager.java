package oopWorkshop2;

public class KrediApplicationManager implements KrediApplicatinService {
	private KrediApplicationDao krediApplicationDao;
	private Logger[] logger;

	public KrediApplicationManager(KrediApplicationDao krediApplicationDao, Logger[] logger) {
		super();
		this.krediApplicationDao = krediApplicationDao;
		this.logger = logger;
	}

	@Override
	public void add(KrediApplication krediApplication, int amount) {
		if (krediApplication.getKredi().getMinAmount() < amount
				&& amount < krediApplication.getKredi().getMaxAmount()) {
			this.krediApplicationDao.add(krediApplication, amount);
			for (Logger logger2 : logger) {
				logger2.log();
			}

		} else {
			System.out.println("Þartlar saðlanamadý.");
		}

	}

	@Override
	public void update(KrediApplication krediApplication, int amount) {
		if (krediApplication.getKredi().getMinAmount() < amount
				&& amount < krediApplication.getKredi().getMaxAmount()) {
			this.krediApplicationDao.update(krediApplication, amount);
			for (Logger logger2 : logger) {
				logger2.log();
			}
		} else {
			System.out.println("Þartlar saðlanamadý.");
		}

	}

	@Override
	public void delete(KrediApplication krediApplication) {
		this.krediApplicationDao.delete(krediApplication);
		System.out.println(" Silindi" + krediApplication.getKredi().getName());
		for (Logger logger2 : logger) {
			logger2.log();
		}

	}
}
