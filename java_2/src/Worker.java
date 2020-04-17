import java.util.Calendar;

public class Worker {
    private String surname;
    private String position;
    private int salary;
    private int year;

    public Worker() {
        this.surname = "Алексеев";
        this.position = "программист";
        this.salary = 50000;
        this.year = 1999;
    }

    public Worker(String sn, String pos, int sal, int y) {
        this.surname = sn;
        this.position = pos;
        this.salary = sal;
        this.year = y;
    }

    public void increaseSalary() {
        this.salary *= 1.15;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.year;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Фамилия: ");
        str.append(surname);
        str.append("\nДолжность: ");
        str.append(position);
        str.append("\nОклад: ");
        str.append(salary);
        str.append("\nГод рождения: ");
        str.append(year);

        return str.toString();
    }
}
