package de.farberg.opendial;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uniluebeck.itm.util.logging.LogLevel;
import de.uniluebeck.itm.util.logging.Logging;
import opendial.DialogueSystem;
import opendial.domains.Domain;
import opendial.readers.XMLDomainReader;

public class Main {

	static {
		Logging.setLoggingDefaults(LogLevel.DEBUG, "[%-5p; %c{1}::%M] %m%n");
	}

	public static void main(String[] args) throws IOException {
		// Obtain an instance of a logger for this class
		Logger log = LoggerFactory.getLogger(Main.class);

		// Output a simple log statement
		log.info("Hallo Welt!");

		// creating the dialogue system
		Domain domain = XMLDomainReader.extractDomain("example.xml");
		DialogueSystem system = new DialogueSystem(domain);

		// When used as part of another application, we often want to switch off the OpenDial GUI
		system.getSettings().showGUI = false;

		// Finally, start the system
		system.startSystem();
		
		system.addUserInput("Hello Opendial");
	}

}
