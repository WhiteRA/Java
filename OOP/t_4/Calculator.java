package OOP.t_4;

public class Calculator<T extends Number> {

    public T multiply(T num1, T num2) {

        double result = num1.doubleValue() * num2.doubleValue();
        // Если тип T - целочисленный, то возвращаем результат как Integer
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) (int) result;
        }
        // Если тип T - числа с плавающей точкой, то возвращаем результат как Double
        else {
            return (T) (Double) result;
        }
    }

    public T divide(T num1, T num2) {
        // Если делитель равен нулю, выбрасываем исключение
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }

        double result = num1.doubleValue() / num2.doubleValue();

        // Если тип T - целочисленный, то возвращаем результат как Integer
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) (int) result;
        }
        // Если тип T - числа с плавающей точкой, то возвращаем результат как Double
        else {
            return (T) (Double) result;
        }
    }

    public String binaryConversion(T num) {
        int value;

        // Если num - строка, парсим ее в int
        if (num instanceof String) {
            try {
                value = Integer.parseInt((String) num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Неверный формат числа");
            }
        }
        // Если num - число типа int, преобразуем его
        else if (num instanceof Integer) {
            value = (Integer) num;
        } else {
            throw new IllegalArgumentException("Неверный тип числа");
        }

        // Переводим число в бинарное представление
        String binary = Integer.toBinaryString(value);
        return binary;
    }
}