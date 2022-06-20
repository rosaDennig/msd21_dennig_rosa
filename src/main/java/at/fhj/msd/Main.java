package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *   calls methods from class Calculation and prints the results of calculations
 *   @author  Rosa Dennig
 */
public class Main {

    /**
     *  Creates a logger
     */

    private static Logger logger = LogManager.getLogger();


    /**
     * input arguments for the calculations
     * @param args
     */
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.divide(1.0, 33.3));
        System.out.println(calc.divide(1.0, 1.0));
        System.out.println(calc.multiply(1.0, 33.3));
        System.out.println(calc.minus(1.0, 33.3));
        System.out.println(calc.add(1.0, 33.3));
        System.out.println(calc.calcFaculty(6));

        // log messages

        logger.debug("It is a debug logger.");
        logger.error("It is an error logger.");
        logger.fatal("It is a fatal logger.");
        logger.info("It is a info logger.");
        logger.trace("It is a trace logger.");
        logger.warn("It is a warn logger.");

    }
}
