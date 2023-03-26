package lab2;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int num, int deno) {
        this.numerator = num;
        this.denominator = deno;
    }

    public Rational divide(Rational other) {
        int num = numerator * other.denominator;
        int deno = denominator * other.numerator;
        Rational res = new Rational(num, deno);
        return res;
    }

    public Rational multiply(Rational other) {
        int num = numerator * other.numerator;
        int deno = denominator * other.denominator;
        Rational res = new Rational(num, deno);
        return res;
    }

    public Rational minus(Rational other) {
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rational rational = (Rational) o;

        if (numerator != rational.numerator) return false;
        return denominator == rational.denominator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}