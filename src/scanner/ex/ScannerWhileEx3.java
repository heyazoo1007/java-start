package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;
        int totalCount = 0;
        int input = 0;
//        while (true) {
//            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
//            int num = input.nextInt();
//
//            if (num == -1) {
//                break;
//            }
//            totalSum += num;
//            totalCount++;
//        }
//

        // 위의 while 문 축약 버전
        while ((input = scanner.nextInt()) != -1) {
            totalSum += input;
            totalCount++;
        }

        if (totalCount > 0) { // 분모가 0이 되는 것을 미리 방지
            double average = (double) totalSum / totalCount;
            System.out.println("입력한 숫자들의 합계 : " + totalSum);
            System.out.println("입력한 숫자들의 평균 : " + average);
        }
    }
}
