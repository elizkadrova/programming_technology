public class ProductRUB {
    private String name;
    private int priceRUB;
    private String made;

    private double RubPerUsd = 80.0;

    public ProductRUB() {
        this.name = "Unknown";
        this.priceRUB = 100;
        this.made = "China";
    }

    public ProductRUB(String n, int p, String m) {
        this.name = n;
        this.priceRUB = p;
        this.made = m;
    }

    public double getUSD() {
        return this.priceRUB / this.RubPerUsd;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Название: ");
        str.append(name);
        str.append("\nЦена (в рублях): ");
        str.append(priceRUB);
        str.append("\nПроизводитель: ");
        str.append(made);

        return str.toString();
    }
}
