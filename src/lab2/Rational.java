package lab2;

public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int num, int deno) {
        int reduced = gcd(num,deno);
        this.numerator = num / reduced;
        this.denominator = deno / reduced;
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
        return new Rational(numerator * other.denominator - other.numerator * denominator,
                denominator * other.denominator);
    }
    public Rational plus(Rational other) {
        return new Rational(numerator * other.denominator + other.numerator * denominator,
                denominator * other.denominator);
    }
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
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