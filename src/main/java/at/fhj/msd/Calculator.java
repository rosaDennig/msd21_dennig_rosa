package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();



    public double add(double number1, double number2) {
        logger.debug(number1 + "add" +number2);
        return number1 + number2;
    }
    public double minus(double number1, double number2) {
        logger.debug(number1 + "minus" +number2);
        return number1 - number2;
    }
    public double multiply(double number1, double number2) {
        logger.debug("multiply"+ number1 + "by" +number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException {
        logger.debug("divide" + number1 + "by" + number2);
        if (number2 == 0) {
            logger.error("division by zero");
             throw new ArithmeticException();
        } else  return number1 / number2;

    }



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

