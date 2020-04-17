import java.util.Scanner;

public class Main {
    public static String numbers[] = new String[]
            {"Ноль", "Один", "Два", "Три", "Четыре",
            "Пять", "Шесть", "Семь", "Восемь", "Девять"};

    public static void outMessage(String message) {
        System.out.println(message);
    }

    public static double enterNumber(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static String enterString(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int[] enterNumbers() {
        int n = (int) enterNumber("Введите число элементов массива n: ");

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.print("Введите элементы массива (целые числа): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void condition1() {
        outMessage("\nУсловные операторы. Задание 1.");

        double num1 = enterNumber("Первое число: ");
        double num2 = enterNumber("Второе число: ");

        double sum = Math.pow(num1, 2) + Math.pow(num2, 2);
        double sqr = Math.pow(num1 + num2, 2);

        if (sum > sqr) {
            outMessage("Сумма квадратов больше квадрата суммы.");
        }
        else {
            outMessage("Квадрат суммы больше суммы квадратов");
        }
    }

    public static void condition2() {
        outMessage("\nУсловные операторы. Задание 2.");

        double experience = enterNumber("Стаж работы (в годах): ");
        double salary = enterNumber("Зарплата: ");
        double percentage = 0;

        if (experience >= 2.0 && experience < 5.0) {
            percentage = 2;
        }
        else if (experience >= 5.0 && experience < 10.0) {
            percentage = 5;
        }

        double amount = salary * (percentage + 100) / 100.0f;

        outMessage("Надбавка: " + percentage + " %");
        outMessage("Сумма к выплате: " + amount);
    }

    public static void condition3() {
        outMessage("\nУсловные операторы. Задание 3.");

        double x1 = enterNumber("Введите координату x точки A: ");
        double y1 = enterNumber("Введите координату y точки A: ");
        double x2 = enterNumber("Введите координату x точки B: ");
        double y2 = enterNumber("Введите координату y точки B: ");

        double d1 = Math.sqrt(x1*x1 + y1*y1);
        double d2 = Math.sqrt(x2*x2 + y2*y2);

        if (d1 > d2) {
            outMessage("Точка А удалена от начала координат больше чем точка B.");
        }
        else if (d2 > d1) {
            outMessage("Точка B удалена от начала координат больше чем точка A.");
        }
        else {
            outMessage("Точки A и B равноудалены от центра координат.");
        }
    }

    public static void condition4() {
        outMessage("\nУсловные операторы. Задание 4.");

        double a_2 = Math.pow(enterNumber("Введите сторону a: "), 2);
        double b_2 = Math.pow(enterNumber("Введите сторону b: "), 2);
        double c_2 = Math.pow(enterNumber("Введите сторону с: "), 2);

        if (a_2 == b_2 + c_2 || b_2 == a_2 + c_2 || c_2 == a_2 + b_2) {
            outMessage("Треугольник прямоугольный");
        }
        else {
            outMessage("Треугольник не прямоугольный");
        }
    }

    public static void condition5() {
        outMessage("\nУсловные операторы. Задание 5.");

        double num1 = enterNumber("Введите число 1: ");
        double num2 = enterNumber("Введите число 2: ");
        double num3 = enterNumber("Введите число 3: ");

        num1 = num1 > 0 ? num1 * num1 : num1;
        num2 = num2 > 0 ? num2 * num2 : num2;
        num3 = num3 > 0 ? num3 * num3 : num3;

        outMessage("Полученные числа: " + num1 + " " + num2 + " " + num3);
    }

    public static void condition6() {
        outMessage("\nУсловные операторы. Задание 6.");

        int num = (int) enterNumber("Введите число от 1 до 12: ");

        switch (num) {
            case 1: case 2: case 12: {
                outMessage("Зима");
                break;
            }
            case 3: case 4: case 5: {
                outMessage("Весна");
                break;
            }
            case 6: case 7: case 8: {
                outMessage("Лето");
                break;
            }
            case 9: case 10: case 11: {
                outMessage("Осень");
                break;
            }
            default: outMessage("Недопустимое число");
        }
    }

    private static int sumDigits(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static void while1() {
        outMessage("\nОператоры цикла с предусловием и постусловием. Задание 1.");

        int N = (int) enterNumber("Введите N > 0: ");

        int i = 1;
        StringBuilder res = new StringBuilder();
        do {
            int sum = sumDigits(i);
            if (i % 3 == 0 & i % 5 != 0 & sum % 3 == 0 & sum % 5 != 0) {
                res.append(" ").append(i);
            }
        } while (i++ < N);

        if (res.length() == 0) {
            outMessage("Числа кратные 3 и некратные 5 отсутствуют.");
        }
        else {
            outMessage("Числа кратные 3 и некратные 5:" + res.toString());
        }
    }

    public static void while2() {
        outMessage("\nОператоры цикла с предусловием и постусловием. Задание 2.");

        int N = (int) enterNumber("Введите N > 0: ");

        int i = 1;
        StringBuilder res = new StringBuilder();
        do {
            if (i % 5 == 0) {
                res.append(" ").append(i);
            }
        } while (i++ < N);

        if (res.length() == 0) {
            outMessage("Числа кратные 5 отсутствуют.");
        }
        else {
            outMessage("Числа кратные 5:" + res.toString());
        }
    }

    public static void while3() {
        outMessage("\nОператоры цикла с предусловием и постусловием. Задание 3.");

        int N = (int) enterNumber("Введите натуральное число: ");

        if (N < 1) {
            outMessage("Некорректный ввод.");
        }
        else {
            boolean flag = true;
            while (N > 1) {
                if (N % 2 != 0) {
                    flag = false;
                    break;
                }
                N /= 2;
            }

            if (flag) {
                outMessage("Число - степень двойки.");
            }
            else {
                outMessage("Число - не степень двойки");
            }
        }
    }

    public static void while4() {
        outMessage("\nОператоры цикла с предусловием и постусловием. Задание 4.");

        int N = (int) enterNumber("Введите N: ");
        StringBuilder res = new StringBuilder();
        int prev = 1, last = 1;
        while (last < N) {
            int next = last + prev;
            res.append(", ").append(next);
            prev = last;
            last = next;
        }

        outMessage("Результат: 1, 1" + res.toString());

    }

    public static void for1() {
        outMessage("\nОператор цикла с параметром. Задание 1.");

        int A = (int) enterNumber("Введите целое число A: ");
        int B = (int) enterNumber("Введите целое число B (> A): ");

        StringBuilder res = new StringBuilder();
        int N = 0;
        for (int i = A; i <= B; i++, N++) {
            res.append(" ").append(i);
        }

        outMessage("Найденные числа:" + res.toString());
        outMessage("Количество найденных чисел: " + N);
    }

    public static void for2() {
        outMessage("\nОператор цикла с параметром. Задание 2.");

        int A = (int) enterNumber("Введите целое число A: ");
        int B = (int) enterNumber("Введите целое число B (> A): ");

        StringBuilder res = new StringBuilder();
        int N = 0;
        for (int i = B - 1; i > A; i--, N++) {
            res.append(" ").append(i);
        }

        outMessage("Найденные числа:" + res.toString());
        outMessage("Количество найденных чисел: " + N);
    }

    public static void for3() {
        outMessage("\nОператор цикла с параметром. Задание 3.");

        double A = enterNumber("Введите вещественное число A: ");
        int N = (int) enterNumber("Введите натуральное число N: ");

        double res = 1;
        for (int i = 0; i < N; i++) {
            res *= A;
        }

        outMessage("A в степени N: " + res);
    }

    public static void for4() {
        outMessage("\nОператор цикла с параметром. Задание 4.");

        double A = enterNumber("Введите вещественное число A: ");
        int N = (int) enterNumber("Введите натуральное число N: ");

        StringBuilder res = new StringBuilder();
        double num = 1;
        for (int i = 0; i < N; i++) {
            num *= A;
            res.append(" ").append(num);
        }

        outMessage("Степени числа A от 1 до N: " + res.toString());
    }

    public static void array1() {
        outMessage("\nМассивы. Задание 1.");

        int[] arr = enterNumbers();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int elem : arr) {
            if (elem % 2 == 0) {
                even.append(" ").append(elem);
            }
            else {
                odd.append(" ").append(elem);
            }
        }

        outMessage("Чётные числа:" + even.toString());
        outMessage("Нечётные числа:" + odd.toString());
    }

    public static void array2() {
        outMessage("\nМассивы. Задание 2.");

        int[] arr = enterNumbers();
        StringBuilder res3 = new StringBuilder();
        StringBuilder res9 = new StringBuilder();

        for (int elem : arr) {
            if (elem % 3 == 0) {
                res3.append(" ").append(elem);
                if (elem % 9 == 0) {
                    res9.append(" ").append(elem);
                }
            }
        }

        outMessage("Числа кратные 3:" + res3.toString());
        outMessage("Числа кратные 9:" + res9.toString());
    }

    public static void array3() {
        outMessage("\nМассивы. Задание 3.");

        int[] arr = enterNumbers();
        StringBuilder res5 = new StringBuilder();
        StringBuilder res10 = new StringBuilder();

        for (int elem : arr) {
            if (elem % 5 == 0) {
                res5.append(" ").append(elem);
                if (elem % 2 == 0) {
                    res10.append(" ").append(elem);
                }
            }
        }

        outMessage("Числа кратные 5:" + res5.toString());
        outMessage("Числа кратные 10:" + res10.toString());
    }

    private static int NOD(int a, int b) {
        // алгоритм евклида
        while (a != 0 & b != 0) {
            if (a > b) {
                a %= b;
            }
            else {
                b %= a;
            }
        }
        return a + b;
    }

    public static void array4() {
        outMessage("\nМассивы. Задание 4.");

        int[] arr = enterNumbers();
        int nok = arr[0], nod = arr[0];

        for (int i = 1; i < arr.length; i++) {
            nod = NOD(arr[i], nod);
            nok = nok * arr[i] / NOD(nok, arr[i]);
        }

        outMessage("Наибольший общий делитель: " + nod);
        outMessage("Наименьшее общее кратное: " + nok);
    }

    public static void array5() {
        outMessage("\nМассивы. Задание 5.");

        int[] arr = enterNumbers();
        StringBuilder res = new StringBuilder();

        for (int elem : arr) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(elem); i++) {
                if (elem % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                res.append(" ").append(elem);
            }
        }

        outMessage("Простые числа:" + res.toString());
    }

    public static boolean luckyNum(int number, int count){
        if(count >= 20)  // ограничение
            return false;

        int lucky = 0;
        do {
            lucky += Math.pow(number % 10, 2);
            number /= 10;
        } while (number != 0);

        return lucky == 1 ? true : luckyNum(lucky, count + 1);
    }

    public static void array6() {
        outMessage("\nМассивы. Задание 6.");

        int[] arr = enterNumbers();
        StringBuilder res = new StringBuilder();

        for (int elem : arr) {
            if (luckyNum(elem, 0)) {
                res.append(" ").append(elem);
            }
        }

        outMessage("\"Счастливые\" числа:" + res.toString());
    }

    public static void array7() {
        outMessage("\nМассивы. Задание 7.");

        int n = (int) enterNumber("Введите цифру от 0 до 9: ");
        if (n < 0 | n > 9) {
            outMessage("Некорректный ввод!");
        }
        else {
            outMessage(numbers[n]);
        }
    }
    
    public static void main(String[] args) {
        final String all_tasks =
                "\n1 - Условные операторы\n" +
                "2 - Операторы цикла с предусловием и постусловием\n" +
                "3 - Оператор цикла с параметром\n" +
                "4 - Массивы\n" +
                "Любой другой символ - выход\n" +
                "Ввод: ";

        final String condition_tasks =
                "\nЧисла от 1 до 6 - задания из темы Условные операторы\n" +
                "Другой ввод - назад\n" + "Ввод: ";
        final String while_tasks =
                "\nЧисла от 1 до 4 - задания из темы Операторы цикла с предусловием и постусловием\n" +
                "Другой ввод - назад\n" + "Ввод: ";
        final String for_tasks =
                "\nЧисла от 1 до 4 - задания из темы Оператор цикла с параметром\n" +
                "Другой ввод - назад\n" + "Ввод: ";
        final String array_tasks =
                "\nЧисла от 1 до 7 - задания из темы Массивы\n" +
                "Другой ввод - назад\n" + "Ввод: ";

        boolean exit = false;
        while (!exit) {
            String in = enterString(all_tasks);
            switch (in) {
                case "1": {
                    boolean back = false;
                    while (!back) {
                        in = enterString(condition_tasks);
                        switch (in) {
                            case "1": condition1(); break;
                            case "2": condition2(); break;
                            case "3": condition3(); break;
                            case "4": condition4(); break;
                            case "5": condition5(); break;
                            case "6": condition6(); break;
                            default: back = true; break;
                        }
                    }
                    break;
                }
                case "2": {
                    boolean back = false;
                    while (!back) {
                        in = enterString(while_tasks);
                        switch (in) {
                            case "1": while1(); break;
                            case "2": while2(); break;
                            case "3": while3(); break;
                            case "4": while4(); break;
                            default: back = true; break;
                        }
                    }
                    break;
                }
                case "3": {
                    boolean back = false;
                    while (!back) {
                        in = enterString(for_tasks);
                        switch (in) {
                            case "1": for1(); break;
                            case "2": for2(); break;
                            case "3": for3(); break;
                            case "4": for4(); break;
                            default: back = true; break;
                        }
                    }
                    break;
                }
                case "4": {
                    boolean back = false;
                    while (!back) {
                        in = enterString(array_tasks);
                        switch (in) {
                            case "1": array1(); break;
                            case "2": array2(); break;
                            case "3": array3(); break;
                            case "4": array4(); break;
                            case "5": array5(); break;
                            case "6": array6(); break;
                            case "7": array7(); break;
                            default: back = true; break;
                        }
                    }
                    break;
                }
                default: {
                    exit = true;
                    break;
                }
            }
        }
    }
}
