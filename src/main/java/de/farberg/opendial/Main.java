package de.farberg.opendial;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uniluebeck.itm.util.logging.LogLevel;
import de.uniluebeck.itm.util.logging.Logging;

public class Main {

	static {
		Logging.setLoggingDefaults(LogLevel.DEBUG, "[%-5p; %c{1}::%M] %m%n");
	}

	public static void main(String[] args) throws IOException {
		// Obtain an instance of a logger for this class
		Logger log = LoggerFactory.getLogger(Main.class);

		// Output a simple log statement
		log.info("Hallo Welt!");

		opendial.DialogueSystem.main(args);
	}

}
