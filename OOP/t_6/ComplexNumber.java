package OOP.t_6;

// SOLID: Принцип открытости/закрытости - Класс открыт для расширения через реализацию интерфейса Number,
// но закрыт для изменения, так как не требует изменений при добавлении новых арифметических операций.

class ComplexNumber implements Number<ComplexNumber> {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber other) {

        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException(" Делить на 0 нельзя ");
        }

        double resultReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double resultImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public String toString() {

        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
