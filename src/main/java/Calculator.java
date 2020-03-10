/**
 * Created by kate on 1/12/16.
 */

public class Calculator {

    public static void main(String[] args) {
    }

    public int add(int a, int b) {

        return a + b;
    }

    public int subtraction(int a, int b) {

        return a - b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public double division(double a, double b) {

        double divisionResult = a / b;

        if(Double.isInfinite(divisionResult)){
            System.out.println("Can't be divided by 0");
            divisionResult = 0;
        }

      return divisionResult;
    }

    public int square(int a) {

        return a * a;
    }

    public double root(double a) {

        double rootResult = Math.sqrt(a);

        if(Double.isNaN(rootResult)){
            System.out.println("incorrect value: " + a);
           rootResult = 0;
        }

        return rootResult;
    }

    public double exponentiating(double a, double b) {

        return Math.pow(a, b);
    }

    //TODO
    //add methods for multiply, division, subtraction, square root, x^2
}







