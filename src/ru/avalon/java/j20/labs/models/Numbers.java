package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) sum += value;
        return sum;
    }
    
    public static <T extends Number> double sum(T[] values) {
        double sum = 0.0;
        for (T value : values) sum += value.doubleValue();
        return sum;
        }
    
    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static double avg(int[] values) {
        return (double) sum(values) / values.length;
    }
    
    public static <T extends Number> double avg(T[] values) {
        return (double) sum(values) / values.length;
    }
    
    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    public static <T extends Number> T max(T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static int max(int[] values) {
        int result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }
    
    public static <T extends Number> T max(T[] values) {
        T result = values[0];
        for (T value : values) result = max(result, value);
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    
    public static <T extends Number> T min(T a, T b) {
        return a.doubleValue() < b.doubleValue() ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static int min(int[] values) {
        int result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
    
    public static <T extends Number> T min(T[] values) {
        T result = values[0];
        for (T value : values) result = min(result, value);
        return result;
    }
}
