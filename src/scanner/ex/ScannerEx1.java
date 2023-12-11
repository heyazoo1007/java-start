package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("사용자 이름을 입력하세요 : ");
        String name = input.nextLine();

        System.out.print("사용자 나이를 입력하세요 : ");
        int age = input.nextInt();

        System.out.println("사용자 이름은 " + name + "이고, 사용자 나이는 " + age + "입니다.");
    }
}
