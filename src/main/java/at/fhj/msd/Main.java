package at.fhj.msd;

import at.fhj.msd.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(1.0, 33.3));
        System.out.println(calc.multiply(1.0, 33.3));
        System.out.println(calc.minus(1.0, 33.3));
        System.out.println(calc.add(1.0, 33.3));
        System.out.println(calc.calcFaculty(6));

    }
}
