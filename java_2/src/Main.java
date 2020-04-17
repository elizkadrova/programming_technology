public class Main {

    private static void testProduct() {
        Product oldPr = new Product("Старый продукт", 10000, 2005);
        Product newPr = new Product("Новый продукт", 5000, 2020);

        oldPr.increasePrice();
        newPr.increasePrice();

        System.out.println("Возраст старого продукта: " + oldPr.getAge());
        System.out.println("Возраст нового продукта: " + newPr.getAge());
        System.out.println();

        System.out.println(oldPr);
        System.out.println();
        System.out.println(newPr);  //цена увеличилась на 20%
    }

    private static void testProductRub() {
        ProductRUB pr = new ProductRUB("Смартфон", 25000, "USA");
        System.out.println(pr);
        System.out.println("Цена в долларах: " + pr.getUSD());
    }

    private static void testRoom() {
        Room room = new Room();
        System.out.println(room);
        System.out.println("Площадь стен: " + room.getSquareOfWalls());
        System.out.println("Площадь стен без окна и двери: " + room.getSquareOfWallsWithoutDoorAndWindow());
    }

    private static void testWorker() {
        Worker worker = new Worker();
        System.out.println(worker);
        System.out.println("Возраст: " + worker.getAge());

        worker.increaseSalary();
        System.out.println("\nПовышение оклада на 15%");
        System.out.println(worker);
    }

    private static void testProperFraction() throws Exception {
        try {
            ProperFraction incorrect = new ProperFraction(5, 2);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ProperFraction pf = new ProperFraction(1, 9);
        System.out.println(pf);
        System.out.println("В процентах: " + pf.getPercentage());
        System.out.println("Сумма цифр числителя и знаменателя: " + pf.sumOfDigits());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("----------Класс Товар----------");
	    testProduct();
	    System.out.println();

        System.out.println("----------Класс Товар (рубли)----------");
        testProductRub();
        System.out.println();

        System.out.println("----------Класс Комната----------");
        testRoom();
        System.out.println();

        System.out.println("----------Класс Работник----------");
        testWorker();
        System.out.println();

        System.out.println("----------Класс Правильная Дробь----------");
        testProperFraction();
        System.out.println();
    }
}
