package Alfa;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("i clicked on the button");
		log.info("button is displayed");
		log.error("button is not dispalyed");
		log.fatal("button is missing");

	}

}
