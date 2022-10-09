package polymorphismDemo;

public class CustomerManager {
	private Logger logger;
	public CustomerManager(Logger logger) {
		this.logger=logger;
	}
	public void add() {
		System.out.println("Müþteri eklendi");
		logger.log("log");
	}

}
