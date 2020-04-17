import java.util.Calendar;

public class Product {
    private String name;
    private int price;
    private int year;

    public Product() {
        this.name = "Unknown";
        this.price = 100;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public Product(String n, int p, int y) {
        this.name = n;
        this.price = p;
        this.year = y;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public void increasePrice() {
        if (year == Calendar.getInstance().get(Calendar.YEAR))
            this.price *= 1.2;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Название: ");
        str.append(name);
        str.append("\nЦена: ");
        str.append(price);
        str.append("\nГод изготовления: ");
        str.append(year);

        return str.toString();
    }
}
