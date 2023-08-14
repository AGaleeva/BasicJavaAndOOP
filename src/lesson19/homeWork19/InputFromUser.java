package lesson19.homeWork19;

import lesson19.SmartArray;

import java.util.Arrays;
import java.util.Scanner;

public class InputFromUser {
    /*
    Используя класс SmartArray реализуйте следующую программу: пользователь с клавиатуры вводит целые числа.
    Как только пользователь вводит 0, программа выдает следующее:
    You have input the following numbers: …введенные_значения…..
    Total …колмчество_чисел… numbers
    Average value: …среднее…
    */

    public static void main(String[] args) {

        int number = 1;
        SmartArray userArray = new SmartArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is the game \"Give me an integer\". " +
                "You have to enter integers as many as you want, " +
                "but the number \"0\" means the end of the game.");

        do {
            System.out.println("Please enter the integer: ");
            number = scanner.nextInt();
            userArray.add(number);
        } while (number != 0);

        if (number == 0) {
            int actualSize = userArray.getSize() - 1;
            System.out.println("You entered the following numbers: ");
            int[] actualArray = userArray.getArray();
            for (int i = 0; i < actualSize ; i++) {
                System.out.print(((i == 0) ? "[" : "") + actualArray[i] + ((i == actualSize - 1) ? "]" : ", "));
            }
            System.out.println();
            System.out.println("Total numbers are: " + actualSize);
            System.out.printf("The average is: %.3f", userArray.gameArrAvg());
            System.out.println();
        }

    }
}
