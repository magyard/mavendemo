import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        BasicConfigurator.configure();

        //factory method
        Logger logger = Logger.getLogger(Main.class);
        logger.setLevel(Level.DEBUG);


        //sout the string if the trace condition satisfied in the level
        logger.trace("Trace message");
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.fatal("Fatal message");
    }
}
