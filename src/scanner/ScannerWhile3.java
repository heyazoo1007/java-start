package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("정수를 입력하세요(0을 입력하면 종료) : ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("입력한 모든 정수 합 : " + sum);
                break;
            }

            sum += number;
        }
    }
}
