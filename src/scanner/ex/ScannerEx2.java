package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = input.nextInt();

        // 방법1. 삼항 연산자 사용
        String str = number % 2 == 0 ? "짝수" : "홀수";
        System.out.println("입력한 숫자 " + number + "은(는) " + str + "입니다.");

        // 방법2. if 분기문 사용하기
//        if (number % 2 == 0) {
//            System.out.println("숫자 " + number + "는(은) 짝수 입니다.");
//        } else {
//            System.out.println("숫자 " + number + "는(은) 홀수 입니다.");
//        }
    }
}
