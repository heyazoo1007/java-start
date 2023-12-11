package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.println("상품 입력 : 1, 결제 : 2, 프로그램 종료 : 3");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine(); // 이 코드가 있어야 입력 라인이 따로따로 출력된다. 

                System.out.print("상품명을 입력하세요 : ");
                String name = input.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = input.nextInt();

                System.out.print("상품의 수량을 입력하세요 : ");
                int quantity = input.nextInt();
                totalPrice += price * quantity;

                System.out.println("상품명 : " + name + ", 가격 : " + price + ", 수량 : " + quantity);
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalPrice);
                totalPrice = 0;
            } else if (option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해 주세요.");
            }
        }
    }
}
