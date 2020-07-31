package jbk_log4j;

import org.apache.log4j.Logger;

public class Demo {
	
	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(Demo.class);		
	
		log.info("Hello");
		log.debug("This is Debug");
		log.error("This is error message");
	}

}
