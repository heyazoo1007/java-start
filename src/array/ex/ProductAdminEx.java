package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0; // 현재 등록된 상품의 개수

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료 \n 메뉴를 선택하세요 : ");
            int option = scanner.nextInt();
            scanner.nextLine();


            if (option == 1) {
                if (productCount == 9) {
                    System.out.println("상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품의 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (option == 2) {
                if (option == 2 && productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 옵션을 선택하셨습니다. ");
            }
        }
    }
}
