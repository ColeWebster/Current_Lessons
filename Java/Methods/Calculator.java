public class Calculator {
    public Calculator(){

    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        int result = a / b;
        return result;
    }

    public int modulo(int a, int b){
        int result = a % b;
        return result;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        int addition = myCalculator.add(5, 7);
        System.out.println(addition);

        int subtraction = myCalculator.subtract(10, 3);
        System.out.println(subtraction);

        int multiplication = myCalculator.multiply(2, 5);
        System.out.println(multiplication);

        int division = myCalculator.divide(21, 3);
        System.out.println(division);

        int moduloOperator = myCalculator.modulo(24, 4);
        System.out.println(moduloOperator);
    }

}
