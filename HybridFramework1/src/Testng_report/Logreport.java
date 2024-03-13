package Testng_report;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Logreport 

{
@Test
 public void console()
 {
BasicConfigurator.configure();
Logger log = Logger.getLogger(this.getClass().getName());
 log.warn("Warning message");
 log.error("Warning message");
 log.info("Warning message");
 }
 
 }
