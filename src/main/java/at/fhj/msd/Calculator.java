package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *  this is a calculator for the 4 basic arithmetic operations and for the faculty calculation
 * @author  Rosa Dennig
 */
public class Calculator {
    /**
     * creates a logger
     */
    private static Logger logger = LogManager.getLogger();


    /**
     * adds two double numbers
     * @param number1 to add
     * @param number2 to add
     * @return result of addition
     */
    public double add(double number1, double number2) {
        logger.debug(number1 + "add" +number2);
        return number1 + number2;
    }

    /**
     * subtracts two double numbers
     * @param number1 to subtract
     * @param number2 to subtract
     * @return result of subtraction
     */
    public double minus(double number1, double number2) {
        logger.debug(number1 + "minus" +number2);
        return number1 - number2;
    }

    /**
     * multiplies two double numbers
     * @param number1 to multiply
     * @param number2 to multiply
     * @return result of multiplication
     */
    public double multiply(double number1, double number2) {
        logger.debug("multiply"+ number1 + "by" +number2);
        return number1 * number2;
    }

    /**
     * divides two double numbers and throws exception if number2 is zero
     * @param number1 to divide
     * @param number2 to divide
     * @return result of division
     * @throws ArithmeticException
     */
    public double divide(double number1, double number2) throws ArithmeticException {
        logger.debug("divide" + number1 + "by" + number2);
        if (number2 == 0) {
            logger.error("division by zero");
             throw new ArithmeticException();
        } else  return number1 / number2;

    }


    /**
     * computes faculty of a number n
     * @param n !
     * @return result of n faculty
     */
    public static long calcFaculty(long n) {
        logger.debug("faculty of"+ n);
        if( n == 0 || n == 1){
            return 1;
        }
        else{
            return n * calcFaculty(n - 1);
        }
    }

}

