package lesson20.homeworkPrevFromL19.numbers;

import java.util.Scanner;

public class NumbersReader {

    public SmartArray read() {
        SmartArray result = new SmartArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers: ");
        System.out.println("'0' means the end of input");

        int num;
      /*
      do {
            num = scanner.nextInt();
            if (num != 0) result.add(num);
        } while (num != 0);
        */

        do {
            System.out.println("next number");
            num = scanner.nextInt();
            if (num == 0) return result;
            result.add(num);
        } while (true);
    }
}
