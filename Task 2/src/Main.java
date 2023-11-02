import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        truthCheck();
    }

    public static void truthCheck(){
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
