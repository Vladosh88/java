package java.java;
//Import
import java.util.Scanner;

// Code
class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение для вычисления формата: \"X + X\"");
        String calculation = scanner.nextLine();
        // System.out.println("Вы ввели "+calculation);

        String[] numbers = calculation.split(" ");
        // System.out.println(numbers[1]);
        if(numbers.length != 3){
            throw new ArithmeticException("Некорректно введены данные, не по формату ввода! Формат \"X + X\"");
        }

        int a, b, result;
        
        try {
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[2]);
        } catch (NumberFormatException e) {
            throw new ArithmeticException("Только с арабскими числами от 1 до 10.");
        }
        
        if (a < 11 && a > 0 && b < 11 && b > 0){
            if(numbers[1].charAt(0) == '+'){
                result = a + b;
                System.out.println(result);
            } else if (numbers[1].charAt(0) == '-'){
                result = a - b;
                System.out.println(result);
            }else if (numbers[1].charAt(0) == '*'){
                result = a * b;
                System.out.println(result);
            }else if (numbers[1].charAt(0) == '/'){
                result = a / b;
                System.out.println(result);
            }else{
                System.out.println("Ошибка, неверный символ");
            }
        } else {
            throw new ArithmeticException("Число не должно быть трехзначное или не больше 10 и не меньше 1");
        }




        // int value;
        // int value2;
        // if (value > 0 && value2 > 0){
        //     if(value > 10 && value2 > 10){
        //         System.out.println("Ошибка, обе переменные больше 10");
        //     } else if(value <= 10 && value2 > 10) {
        //         System.out.println("Ошибка, вторая переменная больше 10");
        //     } else if(value > 10 && value2 <= 10){
        //         System.out.println("Ошибка, первая переменная больше 10");
        //     } else if(value <= 10 && value2 <= 10){

        //     }
        // } else {
        //     System.out.println("Ошибка, обе переменные отрицательные");
        // };
    };
};