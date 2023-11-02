import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
       double result = a / b;
       if (b == 0){
           System.out.println("На ноль делить нельзя!");
       }else {
           System.out.println("Результат деления: " + result);
       }
    }

    private static void diff() {
        //todo дописать логику и печать результата
        double result = a - b;
        System.out.println("Результат вычитания: " + result);
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        double result = a * b;
        System.out.println("Результат умножения: " + result);
    }

    private static void sum() {
        //todo дописать логику и печать результата
        double result = a + b;
        System.out.println("Результат сложения: " + result);
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.print("Введите число: ");
        double inputNum = scanner.nextDouble();
        return inputNum;
    }
}
