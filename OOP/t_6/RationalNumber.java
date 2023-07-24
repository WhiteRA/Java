package OOP.t_6;

class RationalNumber implements Number<RationalNumber> {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {

        int gcd = greatestCommonDivisor(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        if (this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    private int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }

    @Override
    public RationalNumber add(RationalNumber other) {
        int commonDenominator = this.denominator * other.denominator;
        int sumNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new RationalNumber(sumNumerator, commonDenominator);
    }

    @Override
    public RationalNumber subtract(RationalNumber other) {
        int commonDenominator = this.denominator * other.denominator;
        int diffNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new RationalNumber(diffNumerator, commonDenominator);
    }

    @Override
    public RationalNumber multiply(RationalNumber other) {
        return new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    @Override
    public RationalNumber divide(RationalNumber other) {

        if (other.numerator == 0) {
            throw new ArithmeticException(" Делить на 0 нельзя ");
        }
        return new RationalNumber(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    @Override
    public String toString() {

        return denominator == 1 ? String.valueOf(numerator) : numerator + "/" + denominator;
    }
}
