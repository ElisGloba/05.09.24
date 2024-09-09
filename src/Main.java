import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Main {


    // 1. Функция для нахождения максимума
    public static int m(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны!");
        }
        return Math.max(a, b);
    }

    // 2. Калькулятор деления
    public static double d(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return (double) a / b;
    }

    // 3. Конвертер строк в числа
    public static int s(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Некорректная строка для конвертации!");
        }
    }

    // 4. Проверка возраста
    public static void c(int a) {
        if (a < 0 || a > 150) {
            throw new IllegalArgumentException("Некорректный возраст!");
        }
    }

    // 5. Нахождение корня
    public static double r(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Отрицательное число!");
        }
        return Math.sqrt(a);
    }

    // 6. Факториал
    public static int f(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Некорректное число для факториала!");
        }
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    // 7. Проверка массива на нули
    public static void z(int[] arr) {
        for (int n : arr) {
            if (n == 0) {
                throw new IllegalArgumentException("Массив содержит нули!");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public static double p(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Отрицательная степень недопустима!");
        }
        return Math.pow(a, b);
    }

    // 9. Обрезка строки
    public static String t(String str, int len) {
        if (len > str.length()) {
            throw new IllegalArgumentException("Длина больше, чем строка!");
        }
        return str.substring(0, len);
    }

    // 10. Поиск элемента в массиве
    public static int f(int[] arr, int target) {
        for (int n : arr) {
            if (n == target) {
                return n;
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве!");
    }

    // 11. Конвертация в двоичную систему
    public static String b(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Отрицательное число!");
        }
        return Integer.toBinaryString(a);
    }

    // 12. Проверка делимости
    public static boolean v(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public static int e(List<Integer> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка!");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public static void w(String p) {
        if (p.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый!");
        }
    }


    // 15. Проверка даты
    public static void d(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(str, formatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Некорректная дата!", str, 0);
        }
    }

    // 16. Конкатенация строк
    public static String c(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new NullPointerException("Одна из строк равна null!");
        }
        return s1 + s2;
    }

    // 17. Остаток от деления
    public static int r(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public static double q(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Отрицательное число!");
        }
        return Math.sqrt(a);
    }

    // 19. Конвертер температуры
    public static double cToF(double c) {
        if (c < -273.15) {
            throw new IllegalArgumentException("Температура меньше абсолютного нуля!");
        }
        return (c * 9 / 5) + 32;
    }

    // 20. Проверка строки на пустоту
    public static void e(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или null!");
        }
    }
}
