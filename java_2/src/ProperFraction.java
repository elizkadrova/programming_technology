public class ProperFraction {
    private int numerator;
    private int denominator;

    public ProperFraction() {
        this.numerator = 3;
        this.denominator = 4;
    }

    public ProperFraction(int num, int den) throws Exception {
        if (num >= den) {
            throw new Exception("Дробь " + num + "/" + den + " неправильная!");
        }
        this.numerator = num;
        this.denominator = den;
    }

    public double getPercentage() {
        return this.numerator * 100.0 / this.denominator;
    }

    public int sumOfDigits() {
        String digs = Integer.toString(this.numerator) + Integer.toString(this.denominator);
        int result = 0;
        for (char c : digs.toCharArray()) {
            result += Integer.parseInt(String.valueOf(c));
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Числитель: ");
        str.append(numerator);
        str.append("\nЗнаменатель: ");
        str.append(denominator);

        return str.toString();
    }
}
