package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers=new Logger[] {new DataBaseLogger(),new FileLogger(),new MailLogger(),new ConsoleLogger()};
		for (Logger logger : loggers) {
			logger.log("Loglandý");
		}

		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}
	

}
