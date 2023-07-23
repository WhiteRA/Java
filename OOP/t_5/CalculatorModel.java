package OOP.t_5;

class CalculatorModel {
    private double real;
    private double imaginary;

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double add(double real1, double imaginary1, double real2, double imaginary2) {
        return real1 + real2;
    }

    public double subtract(double real1, double imaginary1, double real2, double imaginary2) {
        return real1 - real2;
    }

    public double multiply(double real1, double imaginary1, double real2, double imaginary2) {
        return (real1 * real2) - (imaginary1 * imaginary2);
    }

    public double divide(double real1, double imaginary1, double real2, double imaginary2) {
        double denominator = (real2 * real2) + (imaginary2 * imaginary2);
        double realResult = ((real1 * real2) + (imaginary1 * imaginary2)) / denominator;
        double imaginaryResult = ((imaginary1 * real2) - (real1 * imaginary2)) / denominator;
        setReal(realResult);
        setImaginary(imaginaryResult);
        return denominator;
    }
}
