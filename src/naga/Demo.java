package naga;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.*;



public class Demo {

		private static Logger log =(Logger) LogManager.getLogger(Demo.class.getName());
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am debug");
		log.error("I am error");
		log.info("I am info");
		log.fatal("I am fatal");
		

	}

}
