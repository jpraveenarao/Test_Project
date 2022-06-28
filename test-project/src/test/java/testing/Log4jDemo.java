package testing;
// not completed -- not writing to the log file
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {
	 private static Logger logger= LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("C:\\eclipse-workspace\\testproject\\src\\test\\resources\\log4j2.properties");
		System.out.println("\n Hellooo\n");
		logger.info("This  is information message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("this is fatal message");
		System.out.println("\n  Completed");

	}
}
