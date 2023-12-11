package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = hello.nextLine();

        System.out.print("음식 가격을 입력해주세요 : ");
        int foodPrice = hello.nextInt();

        System.out.print("음식 개수를 입력해주세요 : ");
        int foodNumber = hello.nextInt();

        int totalPrice = foodPrice * foodNumber;
        System.out.println(foodName + "을 " + foodNumber + "개 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");
    }
}
