public class RationalNumber extends Number {
    private int numerator, denominator;

    public RationalNumber(int nume, int deno) {
        numerator = nume;
        denominator = deno;
        if (denominator < 0) {
            numerator = -1 * numerator;
            denominator = -1 * denominator;
        }
        if (denominator == 0 || numerator == 0) {
            numerator = 0;
            denominator = 1;
        } else {
            reduce();
        }
    }
    public double getValue() {
        return ((double) numerator) / ((double) denominator);
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public RationalNumber reciprocal() {
        return new RationalNumber(this.getDenominator(),this.getNumerator());
    }
    public boolean equals(RationalNumber other) {
        return (this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator());
    }
    public String toString() {
        if (this.getDenominator() == 1) {
            return "" + this.getNumerator();
        }
        return this.getNumerator() + "/" + this.getDenominator();
    }
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (true) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int r = a % b;
            if (r == 0) {
                return b;
            }
            a = b;
            b = r;
        }
    }
    private void reduce() {
        int gcd = gcd(numerator,denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    public RationalNumber multiply(RationalNumber other) {
        return new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
    }
    public RationalNumber divide(RationalNumber other) {
        return new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
    }
    public RationalNumber add(RationalNumber other) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new RationalNumber(((a * d) + (b * c)),(b * d));
    }
    public RationalNumber subtract(RationalNumber other) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new RationalNumber(((a * d) - (b * c)), (b * d));
    }
}